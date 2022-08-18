public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkTransport() {
        System.out.println("Проверка велика");
    }
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
