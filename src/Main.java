import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Transport car = new Car("car", 4);
        Transport car2 = new Car("car2", 4);
        Transport truck = new Truck("truck", 6);
        Transport truck2 = new Truck("truck2", 8);
        Transport bicycle = new Bicycle("bicycle", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStationImpl.check(car);
        ServiceStationImpl.check(car2);
        ServiceStationImpl.check(bicycle);
        ServiceStationImpl.check(bicycle2);
        ServiceStationImpl.check(truck);
        ServiceStationImpl.check(truck2);
    }
}
