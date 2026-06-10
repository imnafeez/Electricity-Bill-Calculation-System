import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int customerId;
        String customerName;
        double units, bill;

        System.out.print("Enter Customer ID: ");
        customerId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        units = sc.nextDouble();

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 300) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4.0);
        }

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units Used    : " + units);
        System.out.println("Bill Amount   : Rs. " + bill);

        sc.close();
    }
}
