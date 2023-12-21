package komparator.zad1;

public class Osoba {

    private  String imie;
    private int wiek;

    private double wzrost;

    public Osoba(String imie, int wiek, double wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                '}';
    }

    public int getWiek() {
        return wiek;
    }
}
