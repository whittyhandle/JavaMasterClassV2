package CodingExercise40;

public class HealthyBurger extends Hamburger{
    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Healthy Bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        return super.price + healthyExtra1Price + healthyExtra2Price;
    }
}
