public class Car extends Transport {
        public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTransport() {
        checkEngine();
    }
    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
