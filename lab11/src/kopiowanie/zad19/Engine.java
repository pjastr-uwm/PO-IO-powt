package kopiowanie.zad19;

public class Engine implements Cloneable{

    private double power;
    private int type;
    private String serialNumber;

    public Engine(double power, int type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public Engine(){

    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type=" + type +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException{
        return (Engine) super.clone();
    }
}
