public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car", 4);
        Transport car2 = new Car("car2", 4);
        Transport truck = new Truck("truck", 6);
        Transport truck2 = new Truck("truck2", 8);
        Transport bicycle = new Bicycle("bicycle", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        Transport.check(car);
        System.out.println("------------------");
        Transport.check(bicycle2);
        System.out.println("------------------");
        Transport.check(truck2);
        System.out.println("------------------");




        /*ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        System.out.println("--------------------");
        serviceStation.check(car2);
        System.out.println("--------------------");
        serviceStation.check(truck);
        System.out.println("--------------------");
        serviceStation.check(truck2);
        System.out.println("--------------------");
        serviceStation.check(bicycle);
        System.out.println("--------------------");
        serviceStation.check(bicycle2);*/

    }
}
