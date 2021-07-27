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

    @Override
    public void addHamburgerAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        this.healthyExtra3Name = name;
        this.healthyExtra3Price = price;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        this.healthyExtra4Name = name;
        this.healthyExtra4Price = price;
    }

    @Override
    public double itemizeHamburger() {

        System.out.println(this.name + " hamburger on a " + this.beadRollType + " roll with " + this.meat + ", for " + this.price);

        return super.price + healthyExtra1Price + healthyExtra2Price + healthyExtra3Price + healthyExtra4Price;
    }
}
