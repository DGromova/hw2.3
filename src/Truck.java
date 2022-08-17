public class Truck extends ServiceStation {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
    @Override
    public void checkAuto() {
        checkEngine();
        checkTrailer();
    }
}
