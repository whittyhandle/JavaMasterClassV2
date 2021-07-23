package CodingExercise40;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 15.0, "Deluxe Bread");
        addHamburgerAddition1("Chips", 2.0);
        addHamburgerAddition2("drink", 2.10);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("no additional items can be added");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("no additional items can be added");
    }

//    @Override
//    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
//        System.out.println("no additional items can be added");
//    }
//
//    @Override
//    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
//        System.out.println("no additional items can be added");
//    }
}
