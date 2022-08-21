public class ServiceStation {

    static void changeTyre(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
    public void check(Transport transport) {
        changeTyre(transport);
        transport.checkTransport();
        System.out.println("------------------");
    }
}
