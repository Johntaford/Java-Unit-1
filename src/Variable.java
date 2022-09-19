
public class Variable {
	
	String name;
    String type;

    // default constructor.
   // public Variable(){}

    // parameterized constructor.
    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    // getters
    public String getName() {
        return this.name;
    } 

    public String getType() {
        return this.type;
    }

    public int getBits() {
        int byteSize = 8;
        if(type.equals("byte"))
            return 1*byteSize;
        if(type.equals("short"))
            return 2*byteSize;
        if(type.equals("int"))
            return 4*byteSize;
        if(type.equals("long"))
            return 8*byteSize;
        if(type.equals("float"))
            return 4*byteSize;
        if(type.equals("double"))
            return 8*byteSize;
        if(type.equals("boolean"))
            return 1;
        if(type.equals("char"))
            return 2*byteSize;     
        return 0;
    }
}