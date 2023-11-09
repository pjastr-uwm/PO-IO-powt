package net.cars.zad3;

class Car {

    private String brand;
    private String model;
    private int productionYear;

    public Car(){

    }

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }
}
