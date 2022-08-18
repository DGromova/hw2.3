public interface ServiceStation {
    static void check(Transport transport) {
        transport.changeTyre(transport);
        transport.checkTransport();
        System.out.println("------------------");
    }
    void checkTransport();
}
