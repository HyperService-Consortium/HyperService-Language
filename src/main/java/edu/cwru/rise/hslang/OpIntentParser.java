package edu.cwru.rise.hslang;

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

import edu.cwru.rise.hslang.parser.HSlangLexer;
import edu.cwru.rise.hslang.parser.HSlangParser;

public class OpIntentParser {
    public static void main(String[] args) {
        try {
            // Create a scanner that reads from the input stream passed to us

            String file = "contracts/DelegateAdmin/federated_admin.hsl";
             // String file = "contracts/Finance/demoTest.hsl";
            //String file = "contracts/CrypotAsset/asset_simplified.hsl";
            CharStream charStream = new ANTLRInputStream(new String(Files.readAllBytes(Paths.get(file))));
            Lexer lexer = new HSlangLexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
			long start = System.currentTimeMillis();
			tokens.fill(); // load all and check time


            // Create a parser that reads from the scanner
            HSlangParser parser = new HSlangParser(tokens);
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            // start parsing at the compilationUnit rule
            ParserRuleContext t = parser.sourceFile();
            parser.setBuildParseTree(false);
            //System.out.println("tree:" + t.toStringTree(parser));

            OpIntentVisitor visitor = new OpIntentVisitor();

            visitor.visit(t);

            String dep = visitor.res.toString();
            if(dep.equals("\"dependencies\":[")){
                throw new HSLParsingException("Wrong dependencies");
            }
            if(visitor.visted.size() != visitor.setNum.size()){
                throw new HSLParsingException("Incomplete dependencies");
            }
            String eol = ",\n";
            int eolLen = eol.length();
            String tmp = visitor.output.toString();
            String out = tmp.substring(0,tmp.length()-eolLen);
            System.out.println(out + "\n]");
            dep = dep.substring(0, dep.length()-eolLen);
            System.out.println(dep + "\n]");

            long stop = System.currentTimeMillis();
            long lexerTime = stop-start;
            System.out.println("time: "+ lexerTime);

        } catch (Exception e) {
            System.err.println("parser exception: " + e);
            e.printStackTrace();   // so we can get stack trace
        }
    }
}
