public class Drink extends Product {
    private double capacity;

    public Drink(String name, Double cost, Double capacity) {
        super(name, cost);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Drink {" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", capacity=" + this.capacity +
                '}';
    }
}
