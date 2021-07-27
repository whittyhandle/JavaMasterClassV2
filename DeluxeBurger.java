package CodingExercise40;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe ", "Beef", 10.9, "Deluxe Bread");
        addHamburgerAddition1("Chips", 2.0);
        addHamburgerAddition2("Drink", 2.10);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println(addition1Name + " " + addition1Price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println(addition2Name + " " + addition2Price);
    }

}
