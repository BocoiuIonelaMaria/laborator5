// Bicycle.java
public class Bicycle extends Vehicle {
    private String brand;
    private String model;

    public Bicycle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void speedUp() {
        int speedIncrease = 5;
        setSpeed(getSpeed() + speedIncrease);
        printSpeedIncrease("Bicicletă", speedIncrease);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

