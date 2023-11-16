package pl.edu.uwm.zad3;

public class Hammer extends Tool{
    protected Hammer(String name) {
        super(name);
    }

    public static Hammer create(String name){
        return new Hammer(name);
    }
}
