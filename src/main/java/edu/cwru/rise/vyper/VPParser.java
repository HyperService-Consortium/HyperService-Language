package edu.cwru.rise.vyper;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.nio.file.Files;
import java.nio.file.Paths;

import edu.cwru.rise.hslang.Contract;
import edu.cwru.rise.vyper.parser.VyperLexer;
import edu.cwru.rise.vyper.parser.VyperParser;

/**
 * Created by {Jian Shi} on 2019/4/20.
 */
public class VPParser {

    public static void main(String[] args) {
        try {
            String file = "Option.vy";
            String[] names = file.split("/|\\.");
            int size = names.length-2;
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new VyperLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            VyperParser parser = new VyperParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceUnit();
            parser.setBuildParseTree(false);
            VPVistor vistor = new VPVistor();
            vistor.visit(t);
            vistor.curr.name = names[size];
            vistor.contracts.put(names[size], vistor.curr);
            for (Contract c:
                    vistor.contracts.values()) {
                System.out.println(c);
            }

        }catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }

    public VPVistor vy(String fileName){
        VPVistor vistor = new VPVistor();
        try {
            String[] names = fileName.split("/|\\.");
            int size = names.length-2;
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(fileName))));
            Lexer lexer = new VyperLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            VyperParser parser = new VyperParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceUnit();
            parser.setBuildParseTree(false);
            vistor.curr.name = names[size];
            vistor.contracts.put(names[size], vistor.curr);
            vistor.visit(t);

            /*for (Contract c:
                    vistor.contracts.values()) {
                System.out.println(c);
            }
            */

        }catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
        return vistor;
    }
}
