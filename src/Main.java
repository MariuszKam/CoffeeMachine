import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static class CoffeeMachines {
        private int water = 400;
        private int milk = 540;
        private int beans = 120;
        private int cup = 9;
        private int cash = 550;
        public void printScreen() {
            System.out.println("The coffee machine has: ");
            System.out.println(water + " ml of water");
            System.out.println(milk + " ml of milk");
            System.out.println(beans + " g of coffee beans");
            System.out.println(cup + " disposable cups");
            System.out.println("$" + cash + " of money");
        }
        public void buy() {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    if (water < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (beans < 16) {
                        System.out.println("Sorry, not enough beans!");
                    } else if (cup < 1) {
                        System.out.println("Sorry, not enough cup!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 250;
                        beans -= 16;
                        cup--;
                        cash += 4;
                    }
                    break;
                case "2":
                    if (water < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milk < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beans < 20) {
                        System.out.println("Sorry, not enough beans!");
                    } else if (cup < 1) {
                        System.out.println("Sorry, not enough cup!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        cup--;
                        cash += 7;
                    }
                    break;
                case "3":
                    if (water < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milk < 100) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (beans < 12) {
                        System.out.println("Sorry, not enough beans!");
                    } else if (cup < 1) {
                        System.out.println("Sorry, not enough cup!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        cup--;
                        cash += 6;
                    }
                    break;
                case "back":
                    break;
            }
        }
        public void fill() {
            System.out.println("Write how many ml of water you want to add: ");
            int addWater = scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add: ");
            int addMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            int addBeans = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add: ");
            int addCup = scanner.nextInt();

            water += addWater;
            milk += addMilk;
            beans += addBeans;
            cup += addCup;
        }
        public void take() {
            System.out.println("I gave you $" + cash);
            cash = 0;
        }
    }
    public static void main(String[] args) {
        CoffeeMachines machine = new CoffeeMachines();
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String choice = scanner.nextLine();
            if (choice.equals("buy")) {
                machine.buy();
            }else if (choice.equals("fill")) {
                machine.fill();
            }else if (choice.equals("take")) {
                machine.take();
            } else if (choice.equals("exit")) {
                break;
            } else if (choice.equals("remaining")) {
                machine.printScreen();
            }
        }
    }
}