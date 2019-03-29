package edu.cwru.rise.solidity;

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

import edu.cwru.rise.hslang.*;
import edu.cwru.rise.solidity.parser.SolidityLexer;
import edu.cwru.rise.solidity.parser.SolidityParser;


public class SolidityTypeAnalyzer {
    public static void main(String[] args) {
        try {
            // Create a scanner that reads from the input stream passed to us
            String file = "sol/T1.sol";
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new SolidityLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
//			long start = System.currentTimeMillis();
//			tokens.fill(); // load all and check time
//			long stop = System.currentTimeMillis();
//			lexerTime += stop-start;

            // Create a parser that reads from the scanner
            SolidityParser parser = new SolidityParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceUnit();
            parser.setBuildParseTree(false);
            System.out.println("tree:" + t.toStringTree(parser));

            SolidityVisitor visitor = new SolidityVisitor();
            visitor.visit(t);
            for (Contract c:
                    visitor.contracts.values()) {
                System.out.println(c);
            }

           // for(Type c: visitor.types.values()){
           //     System.out.println(c);
           // }

        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
        //tmp("sol/T2.sol");
    }

    public SolidityVisitor sol(String file){
        SolidityVisitor visitor = new SolidityVisitor();
        try {
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new SolidityLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
//			long start = System.currentTimeMillis();
//			tokens.fill(); // load all and check time
//			long stop = System.currentTimeMillis();
//			lexerTime += stop-start;

            // Create a parser that reads from the scanner
            SolidityParser parser = new SolidityParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceUnit();
            parser.setBuildParseTree(false);
            // String res = t.toStringTree(parser);
            //System.out.println("tree:" + t.toStringTree(parser));

            visitor.visit(t);
        }catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
        return visitor;
    }

    private static void tmp(String fileAdd){
        try {
            // Create a scanner that reads from the input stream passed to us
            String file = fileAdd;
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new SolidityLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
//			long start = System.currentTimeMillis();
//			tokens.fill(); // load all and check time
//			long stop = System.currentTimeMillis();
//			lexerTime += stop-start;

            // Create a parser that reads from the scanner
            SolidityParser parser = new SolidityParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceUnit();
            parser.setBuildParseTree(false);
            String res = t.toStringTree(parser);
            System.out.println("tree:" + t.toStringTree(parser));

            SolidityVisitor visitor = new SolidityVisitor();
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
}