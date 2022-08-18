public abstract class Transport implements ServiceStation {
    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    static void updateTyre() { System.out.println("Меняем покрышку"); }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    void changeTyre(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
    }
    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
