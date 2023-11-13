// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("Ford", "Mustang");
        vehicles.add(car);

        Bicycle bicycle = new Bicycle("Giant", "Defy");
        vehicles.add(bicycle);

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car carItem = (Car) vehicle;
                System.out.println("Mașină: " + carItem.getBrand() + " " + carItem.getModel());
            } else if (vehicle instanceof Bicycle) {
                Bicycle bicycleItem = (Bicycle) vehicle;
                System.out.println("Bicicletă: " + bicycleItem.getBrand() + " " + bicycleItem.getModel());
            }
        }
    }
}
