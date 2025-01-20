import java.util.Scanner;

class ElectricityBill {
    String customerName;
    int unitsConsumed;

    ElectricityBill(String name, int units) {
        customerName = name;
        unitsConsumed = units;
    }

    double calculateBill() {
        double ratePerUnit = 10; // Rate per unit
        return unitsConsumed * ratePerUnit;
    }

    void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        // Format the bill display with the currency symbol Rs.
        System.out.printf("Total Bill: Rs. %.2f\n", calculateBill());
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        ElectricityBill bill = new ElectricityBill(name, units);

        bill.displayBill();

        scanner.close();
    }
}
