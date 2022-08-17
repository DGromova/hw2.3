public abstract class Transport {
    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public static void updateTyre() { System.out.println("Меняем покрышку"); }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    @Override
    public String toString() {
        return "Bicycle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
    public void checkAuto() {
    }
    public void changeTyre(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public static void check(Transport transport) {
        transport.changeTyre(transport);
        transport.checkAuto();
    }
}
