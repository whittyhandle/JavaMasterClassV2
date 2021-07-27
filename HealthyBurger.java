package CodingExercise40;

public class HealthyBurger extends Hamburger {
    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;
    String healthyExtra3Name;
    double healthyExtra3Price;
    String healthyExtra4Name;
    double healthyExtra4Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Whole Wheat Bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public void addHealthyAddition3(String name, double price) {
        this.healthyExtra3Name = name;
        this.healthyExtra3Price = price;
    }

    public void addHealthyAddition4(String name, double price) {
        this.healthyExtra4Name = name;
        this.healthyExtra4Price = price;
    }

    @Override
    public double itemizeHamburger() {
        return super.price + healthyExtra1Price + healthyExtra2Price + healthyExtra3Price + healthyExtra4Price;
    }
}
