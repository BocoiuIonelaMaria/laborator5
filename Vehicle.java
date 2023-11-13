
// Vehicle.java
public abstract class Vehicle {
    private int speed;

    public abstract void speedUp();

    protected void printSpeedIncrease(String vehicleType, int speedIncrease) {
        System.out.println(vehicleType + " a crescut viteza cu " + speedIncrease + " unități.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

