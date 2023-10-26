public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.speed);
        car1.accelerate(20);
        System.out.println(car1.speed);
        car1.decelerate(30);
        System.out.println(car1.speed);
        car1.accelerate(50);
        System.out.println(car1.speed);
    }
}

class Car{
    String brand;
    String model;
    int speed;
    void accelerate(int value){
        speed +=value;
    }

    void  decelerate(int value){
        speed -= value;
        if (speed < 0)
        {
            speed =0;
        }
    }
}
