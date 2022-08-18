public class Truck extends Transport {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void checkTransport() {
        checkEngine();
        checkTrailer();
    }
    @Override
    public String toString() {
        return "Truck{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
