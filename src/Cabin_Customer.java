import java.util.Scanner;

public class Cabin_Customer {
    final static String THINGS[] = {"Roll", "Zinger Burger", "Biryani", "Cofta", "Mutton"};
    final static int PRICES[] = {100, 200, 300, 400, 150};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1 Customers
        String customerNames[] = new String[1];
        System.out.println("================================");
        System.out.println("|    Welcome Advance Cabin     |");
        System.out.println("================================");

        for (int i = 0; i < customerNames.length; i++) {
            System.out.print("Customer Name: ");
            customerNames[i] = input.next();
        }
        int thingSelection = 0;
        do {
            System.out.println("============================");
            System.out.println("|    Things Available      |");
            System.out.println("============================");
            System.out.println("No. Thing Price");
            for (int i = 0; i < THINGS.length; i++) {
                System.out.println((i + 1) + " " + THINGS[i] + " " + PRICES[i]);
            }

            System.out.print("Select the Thing : ");
            thingSelection = input.nextInt();

            switch (thingSelection) {
                case 1:
                    System.out.println("You have selected " + THINGS[0]);
                    break;
                case 2:
                    System.out.println("You have selected " + THINGS[1]);
                    break;
                case 3:
                    System.out.println("You have selected " + THINGS[2]);
                    break;
                case 4:
                    System.out.println("You have selected " + THINGS[3]);
                    break;
                case 5:
                    System.out.println("You have selected " + THINGS[4]);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (thingSelection > 5 || thingSelection < 1);
        if (thingSelection >= 1 && thingSelection <= 5) {
            System.out.println("Your Bill is " + PRICES[thingSelection - 1]);
            System.out.println("Thank you for shopping with us.");
        }

    }

}
