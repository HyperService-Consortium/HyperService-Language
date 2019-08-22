package edu.cwru.rise.hslang.structure;

import java.util.ArrayList;
import java.util.List;

public class Contract implements Cloneable {
    public String name;
    public List<Field> fields = new ArrayList<>();
    public List<Function> functions = new ArrayList<>();

    @Override
    public Object clone() {
        Contract newContra = null;
        try {
            newContra = (Contract) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newContra;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Contract " + name + "{ \n");
        for (Field f : fields
                ) {
            sb.append("\t " + f.type + " " + f.name + "{pos# " + f.pos + "}\n");
        }
        for (Function f : functions
                ) {
            sb.append("\t " + f.toString() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public List<Function> getFunctions(){
        return this.functions;
    }
    /*
    public Object deepClone() throws IOException,ClassNotFoundException {
        OutputStream output = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(output);
        oo.writeObject(this);

        InputStream bi = new ByteArrayInputStream(((ByteArrayOutputStream) output).toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }*/

}
