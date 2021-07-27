package CodingExercise40;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends Thread implements ActionListener {

    GUI input;

    Hamburger hamburger;
    HealthyBurger healthyBurger;
    DeluxeBurger deluxeBurger;

    JFrame frame;

    JPanel panelBurger,
            panelAdditionChoices;

    JButton checkoutButton;

    JCheckBox basicCheckBox,
            healthyCheckBox,
            deluxeCheckBox,
            tomatoCheckBox,
            cheeseCheckBox,
            lettuceCheckBox,
            avocadoCheckBox,
            lentilsCheckBox,
            eggCheckBox,
            baconCheckBox;

    String tomato = "Tomato ";
    double tomatoPrice = 0.27;

    String cheese = "Cheese ";
    double cheesePrice = 1.13;

    String lettuce = "Lettuce ";
    double lettucePrice = 0.75;

    String avocado = "Avocado ";
    double avocadoPrice = 1.67;

    String lentils = "Lentils ";
    double lentilsPrice = 3.41;

    String egg = "Egg ";
    double eggPrice = 5.43;

    String bacon = "Bacon ";
    double baconPrice = 2.25;

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) (screenSize.getWidth() * 0.5);
    int height = (int) (screenSize.getHeight() * 0.5);

    @Override
    public void run() {

        input = new GUI();

    }

    public GUI() {

        panelBurger = new JPanel(new GridLayout(3, 1, 10, 10));
        panelBurger.setBorder(BorderFactory.createLineBorder(Color.black));

        panelAdditionChoices = new JPanel(new GridLayout(7, 1, 10, 10));
        panelAdditionChoices.setBorder(BorderFactory.createLineBorder(Color.black));

        checkoutButton = new JButton("Checkout");

        generatedBurgerTypeCheckboxes();
        generatedBurgerAdditionCheckboxes();

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(1, 0));
        frame.getContentPane().add(panelBurger);
        frame.getContentPane().add(panelAdditionChoices);
        frame.add(checkoutButton);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(width, height);

        checkoutButton.addActionListener(e -> {

            basicBurgerChoice();

            healthyBurgerChoice();

            deluxeBurgerChoice();

        });


    }

    private void basicBurgerChoice() {
        if (basicCheckBox.isSelected()) {
            hamburger = new Hamburger("Basic", "Beef", 5.60, "Potato Roll");

            if (!tomatoCheckBox.isSelected()) {
                hamburger.addHamburgerAddition1("", 0.0);
            } else {
                hamburger.addHamburgerAddition1(tomato, tomatoPrice);
            }

            if (!cheeseCheckBox.isSelected()) {
                hamburger.addHamburgerAddition2("", 0.0);
            } else {
                hamburger.addHamburgerAddition2(cheese, cheesePrice);
            }

            if (!lettuceCheckBox.isSelected()) {
                hamburger.addHamburgerAddition3("", 0.0);
            } else {
                hamburger.addHamburgerAddition3(lettuce, lettucePrice);
            }

            if (!avocadoCheckBox.isSelected()) {
                hamburger.addHamburgerAddition4("", 0.0);
            } else {
                hamburger.addHamburgerAddition4(avocado, avocadoPrice);
            }

            if (!lentilsCheckBox.isSelected()) {
                hamburger.addHamburgerAddition5("", 0.0);
            } else {
                hamburger.addHamburgerAddition5(lentils, lentilsPrice);
            }

            if (!eggCheckBox.isSelected()) {
                hamburger.addHamburgerAddition6("", 0.0);
            } else {
                hamburger.addHamburgerAddition6(egg, eggPrice);
            }

            if (!baconCheckBox.isSelected()) {
                hamburger.addHamburgerAddition7("", 0.0);
            } else {
                hamburger.addHamburgerAddition7(bacon, baconPrice);
            }

            JOptionPane.showMessageDialog(frame, "Total $" + hamburger.itemizeHamburger());
        }
    }

    private void healthyBurgerChoice() {
        if (healthyCheckBox.isSelected()) {
            healthyBurger = new HealthyBurger("Turkey", 7.50);

            if (!tomatoCheckBox.isSelected()) {
                healthyBurger.addHealthyAddition1("", 0.0);
            } else {
                healthyBurger.addHealthyAddition1(tomato, tomatoPrice);
            }

            if (!lettuceCheckBox.isSelected()) {
                healthyBurger.addHealthyAddition2("", 0.0);
            } else {
                healthyBurger.addHealthyAddition2(lettuce, lettucePrice);
            }

            if (!avocadoCheckBox.isSelected()) {
                healthyBurger.addHealthyAddition3("", 0.0);
            } else {
                healthyBurger.addHealthyAddition3(avocado, avocadoPrice);
            }
            if (!lentilsCheckBox.isSelected()) {
                healthyBurger.addHealthyAddition4("", 0.0);
            } else {
                healthyBurger.addHealthyAddition4(lentils, lentilsPrice);
            }

            JOptionPane.showMessageDialog(frame, "Total $" + healthyBurger.itemizeHamburger());
        }
    }

    private void deluxeBurgerChoice() {
        if (deluxeCheckBox.isSelected()) {
            deluxeBurger = new DeluxeBurger();

            JOptionPane.showMessageDialog(frame, "Total $" + deluxeBurger.itemizeHamburger());
        }
    }

    private void generatedBurgerTypeCheckboxes() {
        basicCheckBox = new JCheckBox("Basic Burger");
        basicCheckBox.setBounds(75, 50, 100, 30);
        basicCheckBox.setMnemonic(KeyEvent.VK_C);
        basicCheckBox.setSelected(false);
        basicCheckBox.addActionListener(this);

        healthyCheckBox = new JCheckBox("Healthy Burger");
        healthyCheckBox.setBounds(75, 75, 100, 30);
        healthyCheckBox.setMnemonic(KeyEvent.VK_C);
        healthyCheckBox.setSelected(false);
        healthyCheckBox.addActionListener(this);

        deluxeCheckBox = new JCheckBox("Deluxe Burger");
        deluxeCheckBox.setBounds(75, 100, 100, 30);
        deluxeCheckBox.setMnemonic(KeyEvent.VK_C);
        deluxeCheckBox.setSelected(false);
        deluxeCheckBox.addActionListener(this);

        panelBurger.add(basicCheckBox);
        panelBurger.add(healthyCheckBox);
        panelBurger.add(deluxeCheckBox);

        ButtonGroup bg = new ButtonGroup();
        bg.add(basicCheckBox);
        bg.add(healthyCheckBox);
        bg.add(deluxeCheckBox);
    }

    private void generatedBurgerAdditionCheckboxes() {

        tomatoCheckBox = new JCheckBox(tomato + tomatoPrice);
        tomatoCheckBox.setBounds(300, 50, 200, 30);
        tomatoCheckBox.setMnemonic(KeyEvent.VK_C);
        tomatoCheckBox.setSelected(false);
        tomatoCheckBox.addActionListener(this);

        cheeseCheckBox = new JCheckBox(cheese + cheesePrice);
        cheeseCheckBox.setBounds(300, 75, 200, 30);
        cheeseCheckBox.setMnemonic(KeyEvent.VK_C);
        cheeseCheckBox.setSelected(false);
        cheeseCheckBox.addActionListener(this);

        lettuceCheckBox = new JCheckBox(lettuce + lettucePrice);
        lettuceCheckBox.setBounds(300, 100, 200, 30);
        lettuceCheckBox.setMnemonic(KeyEvent.VK_C);
        lettuceCheckBox.setSelected(false);
        lettuceCheckBox.addActionListener(this);

        avocadoCheckBox = new JCheckBox(avocado + avocadoPrice);
        avocadoCheckBox.setBounds(300, 125, 200, 30);
        avocadoCheckBox.setMnemonic(KeyEvent.VK_C);
        avocadoCheckBox.setSelected(false);
        avocadoCheckBox.addActionListener(this);

        lentilsCheckBox = new JCheckBox(lentils + lentilsPrice);
        lentilsCheckBox.setBounds(300, 150, 200, 30);
        lentilsCheckBox.setMnemonic(KeyEvent.VK_C);
        lentilsCheckBox.setSelected(false);
        lentilsCheckBox.addActionListener(this);

        eggCheckBox = new JCheckBox(egg + eggPrice);
        eggCheckBox.setBounds(300, 175, 200, 30);
        eggCheckBox.setMnemonic(KeyEvent.VK_C);
        eggCheckBox.setSelected(false);
        eggCheckBox.addActionListener(this);

        baconCheckBox = new JCheckBox(bacon + baconPrice);
        baconCheckBox.setBounds(300, 200, 200, 30);
        baconCheckBox.setMnemonic(KeyEvent.VK_C);
        baconCheckBox.setSelected(false);
        baconCheckBox.addActionListener(this);

        panelAdditionChoices.add(tomatoCheckBox);
        panelAdditionChoices.add(cheeseCheckBox);
        panelAdditionChoices.add(lettuceCheckBox);
        panelAdditionChoices.add(avocadoCheckBox);
        panelAdditionChoices.add(lentilsCheckBox);
        panelAdditionChoices.add(eggCheckBox);
        panelAdditionChoices.add(baconCheckBox);

        tomatoCheckBox.setEnabled(false);
        cheeseCheckBox.setEnabled(false);
        lettuceCheckBox.setEnabled(false);
        avocadoCheckBox.setEnabled(false);
        lentilsCheckBox.setEnabled(false);
        eggCheckBox.setEnabled(false);
        baconCheckBox.setEnabled(false);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (basicCheckBox.isSelected()) {

            tomatoCheckBox.setEnabled(true);
            cheeseCheckBox.setEnabled(true);
            lettuceCheckBox.setEnabled(true);
            avocadoCheckBox.setEnabled(true);
            lentilsCheckBox.setEnabled(true);
            eggCheckBox.setEnabled(true);
            baconCheckBox.setEnabled(true);

        }

        if (healthyCheckBox.isSelected()) {

            tomatoCheckBox.setEnabled(true);
            cheeseCheckBox.setEnabled(false);
            lettuceCheckBox.setEnabled(true);
            avocadoCheckBox.setEnabled(true);
            lentilsCheckBox.setEnabled(true);
            eggCheckBox.setEnabled(false);
            baconCheckBox.setEnabled(false);

            new HealthyBurger("Impossible Burger", 8.75);
        }

        if (deluxeCheckBox.isSelected()) {

            tomatoCheckBox.setEnabled(false);
            cheeseCheckBox.setEnabled(false);
            lettuceCheckBox.setEnabled(false);
            avocadoCheckBox.setEnabled(false);
            lentilsCheckBox.setEnabled(false);
            eggCheckBox.setEnabled(false);
            baconCheckBox.setEnabled(false);

            new DeluxeBurger();

        }

    }

}
