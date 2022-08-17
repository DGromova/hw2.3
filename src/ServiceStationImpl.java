public interface ServiceStationImpl {
    static void check(Transport transport) {
        transport.changeTyre(transport);
        transport.checkAuto();
        System.out.println("------------------");
    }
    void checkAuto();
}
