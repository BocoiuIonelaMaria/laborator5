// Car.java
public class Car extends Vehicle {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void speedUp() {
        int speedIncrease = 10;
        setSpeed(getSpeed() + speedIncrease);
        printSpeedIncrease("Mașină", speedIncrease);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

