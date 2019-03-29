package edu.cwru.rise.hslang;

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
<<<<<<< HEAD:src/main/java/edu/cwru/rise/hslang/Contract.java


    public List<Field> fields = new ArrayList<>();
    public List<Function> functions = new ArrayList<>();
||||||| merged common ancestors:src/main/java/edu/cwru/rise/solidity/Contract.java


    List<Field> fields = new ArrayList<>();
    List<Function> functions = new ArrayList<>();
=======
    
>>>>>>> 0cd48c0cde03a51233282f22c0fc631b6eda4f54:src/main/java/edu/cwru/rise/hslang/Contract.java

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
