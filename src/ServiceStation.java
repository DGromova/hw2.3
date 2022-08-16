public class ServiceStation implements ServiceStation1 {

    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            AutoCheck.checkEngine();
            System.out.println("--------------------");
    }
    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            Transport.updateTyre();
        }
        AutoCheck.checkEngine();
        Truck.checkTrailer();
        System.out.println("--------------------");
    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            Transport.updateTyre();
        }
        System.out.println("--------------------");
    }
}

