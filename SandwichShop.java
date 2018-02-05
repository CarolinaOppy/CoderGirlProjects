import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int totalVeggies;
        int totalBurgers;
        int totalSubs;
        int totalSoups;


        out.println("Checking sales goals.");
        out.println("THe sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        totalVeggies = keyboard.nextInt();
        if (totalVeggies > goalForVeggies) {
            out.println("Made goal for veggie sandwiches.");
        }
        else if (totalVeggies < goalForVeggies) {
            out.println("Fell short");
        }
        else if (totalVeggies == goalForVeggies) {
            out.println("Meets goal");
        }
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        totalBurgers = keyboard.nextInt();
        if (totalBurgers > goalForBurgers) {
            out.println("Made goal for burgers.");
        }
        else if (totalBurgers < goalForBurgers) {
            out.println("Fell short");
        }
        else if (totalBurgers == goalForBurgers) {
            out.println("Meets goal");
        }
        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        totalSubs = keyboard.nextInt();
        if (totalSubs > goalForSubs) {
            out.println("Made goal for subs.");
        }
        else if ( totalSubs < goalForSubs) {
            out.println("Fell Short");
        }
        else if (totalSubs == goalForSubs) {
            out.println("Meets goal");
        }
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        totalSoups = keyboard.nextInt();
        if (totalSoups > goalForSoup) {
            out.println("Made goal for soup.");
        }
        else if (totalSoups < goalForSoup) {
            out.println("Fell short");
        }
        else if (totalSoups == goalForSoup) {
            out.println("Meets goal");
        }
        if ( totalVeggies >= goalForVeggies && totalBurgers >= goalForBurgers && totalSubs >= goalForSubs && totalSoups >= goalForSoup) {
            out.println("Made goal for everything!");
        }

    }

}
