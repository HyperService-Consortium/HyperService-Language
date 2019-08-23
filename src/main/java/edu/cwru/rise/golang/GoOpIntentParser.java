package edu.cwru.rise.golang;

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

import edu.cwru.rise.golang.parser.GolangLexer;
import edu.cwru.rise.golang.parser.GolangParser;
import edu.cwru.rise.hslang.structure.*;


/**
 * Created by {Jian Shi} on 2019/4/27.
 */
public class GoOpIntentParser {
    public static void main(String[] args) {
        try {
            // Create a scanner that reads from the input stream passed to us
            String file = "contracts/DelegateAdmin/delegate.go";
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new GolangLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that reads from the scanner
            GolangParser parser = new GolangParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceFile();
            parser.setBuildParseTree(false);
            //System.out.println("tree:" + t.toStringTree(parser));

            GoOpIntentVisitor visitor = new GoOpIntentVisitor();
            visitor.visit(t);
            for (Contract c:
                    visitor.contracts.values()) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }

    public GoOpIntentVisitor go(String fileName){
        GoOpIntentVisitor visitor = new GoOpIntentVisitor();
        try {
            // Create a scanner that reads from the input stream passed to us
            String file = fileName;
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new GolangLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that reads from the scanner
            GolangParser parser = new GolangParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceFile();
            parser.setBuildParseTree(false);

            visitor.visit(t);
        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
        return visitor;
    }
}
