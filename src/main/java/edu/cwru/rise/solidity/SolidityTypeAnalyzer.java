package edu.cwru.rise.solidity;

import edu.cwru.rise.hslang.parser.HSlangLexer;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.solidity.parser.SolidityLexer;
import edu.cwru.rise.solidity.parser.SolidityParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.nio.file.Files;
import java.nio.file.Paths;

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

        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }
}
