package edu.cwru.rise.hslang;

import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class OpIntentVisitor extends HSlangBaseVisitor<String> {

    class Field {
        String name;
        String type;
    }

    class Type {
        String name;
        List<Field> fields = new ArrayList<>();

        @Override
        public String toString() {

            System.out.println("class " + name + "::func {");
            for (Field f: fields
                 ) {
                System.out.println("\t " + f.type + " " + f.name);
            }
            System.out.println("}");

            return super.toString();
        }
    }

    List<Type> types = new ArrayList<>();

    @Override
    public String visitPaymentSpec(HSlangParser.PaymentSpecContext ctx) {
        System.out.println("opname: " + ctx.opname.getText());
        return super.visitPaymentSpec(ctx);
    }
}
