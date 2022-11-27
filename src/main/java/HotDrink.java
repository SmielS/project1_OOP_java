public class HotDrink extends Drink{

    private Integer temperature;
    public HotDrink(String name, Double cost, Double capacity, int temperature) {
        super(name, cost, capacity);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink {" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", capacity=" + super.getCapacity() + '\'' +
                ", temperature=" + this.temperature + "°C" +
                '}';
    }
}
