public class Truck extends Transport implements AutoCheck {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
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
}
