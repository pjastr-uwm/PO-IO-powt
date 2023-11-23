package pl.edu.uwm.wmii.zad15;

public class Apartment extends Property{

    private int floorNumber;

    public Apartment(String address, int size, double price, int floorNumber) {
        super(address, size, price);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return super.toString()+","+floorNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Apartment apartment = (Apartment) o;

        return floorNumber == apartment.floorNumber;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + floorNumber;
        return result;
    }
}
