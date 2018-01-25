import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        String Item1;
        out.println("Item 1?");
        Item1 = keyboard.nextLine();
        String Item2;
        out.println("Item 2?");
        Item2 = keyboard.nextLine();
        String Item3;
        out.println("Item 3?");
        Item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        int Item1Count;
        out.println("How many " + Item1 +"?");
        Item1Count = keyboard.nextInt();
        int Item2Count;
        out.println("How many "+ Item2 +"?");
        Item2Count = keyboard.nextInt();
        int Item3Count;
        out.println("How many " + Item3 +"?");
        Item3Count = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        float Item1Cost;
        out.println("How much does one " + Item1 +" cost?");
        Item1Cost = keyboard.nextFloat();
        float Item2Cost;
        out.println("How much does one " + Item2 + " cost?");
        Item2Cost = keyboard.nextFloat();
        float Item3Cost;
        out.println("How much does one " + Item3 + " cost?");
        Item3Cost = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");
        float Item1Total;
        Item1Total = (Item1Count * Item1Cost);
        float Item2Total;
        Item2Total = (Item2Count * Item2Cost);
        float Item3Total;
        Item3Total = (Item3Count * Item3Cost);
        float TotalBill;
        TotalBill = Item1Total + Item2Total + Item3Total;
        out.println("Your total cost is " + TotalBill +" ");

    }
}