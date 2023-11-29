public class Variable {
    private String name;
    private int type;
    private int value;

    public Variable(String name, int type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Variable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}