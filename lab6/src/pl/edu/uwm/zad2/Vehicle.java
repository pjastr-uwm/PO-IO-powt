package pl.edu.uwm.zad2;

import java.util.Objects;

public class Vehicle {

    private String brand;
    private String model;
    private int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction) {
        this.brand = (brand == null || brand.isEmpty()) ? "" : brand;
        this.model = (model == null || model.isEmpty()) ? "" : model;
        this.yearOfProduction = yearOfProduction > 2023 ? 2023 : yearOfProduction;
    }

    @Override
    public String toString() {
        return "Vehicle: "+brand+" "+model+", Year: "+yearOfProduction+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (yearOfProduction != vehicle.yearOfProduction) return false;
        if (!brand.equals(vehicle.brand)) return false;
        return model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + yearOfProduction;
        return result;
    }
}
