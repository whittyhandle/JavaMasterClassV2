package CodingExercise40;

public class Hamburger {

    String name;
    String meat;
    double price;
    String beadRollType;
    String addition1Name;
    String addition2Name;
    String addition3Name;
    String addition4Name;
    double addition1Price;
    double addition2Price;
    double addition3Price;
    double addition4Price;


    public Hamburger(String name, String meat, double price, String beadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.beadRollType = beadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizehamburger(){
        return this.price +
                this.addition1Price +
                this.addition2Price +
                this.addition3Price +
                this.addition4Price;
    }


}