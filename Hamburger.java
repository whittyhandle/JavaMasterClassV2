package CodingExercise40;

public class Hamburger {

    String name;
    String meat;
    double price;
    String beadRollType;

    String addition1Name;
    double addition1Price;

    String addition2Name;
    double addition2Price;

    String addition3Name;
    double addition3Price;

    String addition4Name;
    double addition4Price;

    String addition5Name;
    double addition5Price;

    String addition6Name;
    double addition6Price;

    String addition7Name;
    double addition7Price;

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
    public void addHamburgerAddition5(String addition5Name, double addition5Price) {
        this.addition5Name = addition5Name;
        this.addition5Price = addition5Price;
    }
    public void addHamburgerAddition6(String addition6Name, double addition6Price) {
        this.addition6Name = addition6Name;
        this.addition6Price = addition6Price;
    }
    public void addHamburgerAddition7(String addition7Name, double addition7Price) {
        this.addition7Name = addition7Name;
        this.addition7Price = addition7Price;
    }

    public double itemizeHamburger() {

        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.beadRollType + " roll with " + this.meat + ", for " + this.price);

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
        }

        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
        }

        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
        }

        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
        }

        if (this.addition5Name != null) {
            hamburgerPrice += this.addition5Price;
        }

        if (this.addition6Name != null) {
            hamburgerPrice += this.addition6Price;
        }

        if (this.addition7Name != null) {
            hamburgerPrice += this.addition7Price;
        }

        hamburgerPrice = (Math.round(hamburgerPrice * 100.0)/100.0);

        return hamburgerPrice;

    }

}
