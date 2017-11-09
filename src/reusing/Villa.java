package reusing;

public class Villa {

    private String name;
    protected int num = 0;

    protected void set(String nm) {
        name = nm;
    }

    public Villa(){

    }

    public Villa(String name) {
        this.name = name;
    }

    public String toString() {
        return "I'm a Villain and my name is " + name + " "+num;
    }
}

