public class Car extends ServiceStation {
        public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
    @Override
    public void checkAuto() {
        checkEngine();
    }
}
