public class Main {
    public static void main(String[] args) {
        ServiceStation car = new Car("car", 4);
        ServiceStation car2 = new Car("car2", 4);
        ServiceStation truck = new Truck("truck", 6);
        ServiceStation truck2 = new Truck("truck2", 8);
        ServiceStation bicycle = new Bicycle("bicycle", 2);
        ServiceStation bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation.check(car);
        ServiceStation.check(bicycle2);
        ServiceStation.check(truck2);
    }
}
