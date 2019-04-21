package edu.cwru.rise.javascript;

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

import edu.cwru.rise.javascript.parser.JavaScriptLexer;
import edu.cwru.rise.javascript.parser.JavaScriptParser;

public class JSParser {
    public static void main(String[] args) {
        try {
            // Create a scanner that reads from the input stream passed to us
            String file = "BankVaultContract.js";
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new JavaScriptLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            JavaScriptParser parser = new JavaScriptParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.program();
            parser.setBuildParseTree(false);
            JSVisitor visitor = new JSVisitor();
            visitor.visit(t);

        }catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }
}
