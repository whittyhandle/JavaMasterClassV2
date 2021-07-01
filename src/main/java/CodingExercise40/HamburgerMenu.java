package CodingExercise40;

import java.util.Scanner;

public class HamburgerMenu extends Thread {

    InputMenu input;

    @Override
    public void run() {
        input = new InputMenu();

    }

}

class InputMenu {
    Hamburger hamburger;
    HealthyBurger healthyBurger;
    DeluxeBurger deluxeBurger;

    private String tomato = "Tomato";
    private double tomatoPrice = 0.27;

    private String cheese = "Cheese";
    private double cheesePrice = 1.13;

    private String lettuce = "Lettuce";
    private double lettucePrice = 0.75;

    private String avocado = "Avocado";
    private double avocadoPrice = 1.67;

    private String lentils = "Lentils";
    private double lentilsPrice = 3.41;

    private String egg = "Egg";
    private double eggPrice = 5.43;

    private String bacon = "Bacon";
    private double baconPrice = 2.25;


    public void display_menu()
    {
        System.out.println("1) Basic 1\n2) Healthy 2\n3) Deluxe 3");
        System.out.print("Selection: ");
    }

    public void question()
    {
        System.out.println("Would you like to proceed or quit?");
        System.out.println("To proceed enter 9.");
        System.out.println("If you wish to quit enter 0.");

        Scanner q = new Scanner(System.in);

        switch (q.nextInt())
        {
            case 0:
                System.out.println ("Thank you and goodbye.");
                break;

            case 9:
                System.out.println ("Please proceed.");
                new InputMenu();
                break;

            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }

    public InputMenu()
    {
        Scanner in = new Scanner(System.in);
        display_menu();

        switch (in.nextInt())
        {
            case 1:
                System.out.println ( "You picked a Basic Burger" );
                question();
                break;

            case 2:
                System.out.println ( "You picked Healthy Burger" );
                question();
                break;

            case 3:
                System.out.println ( "You picked Deluxe Burger" );
                question();
                break;

            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }


}

