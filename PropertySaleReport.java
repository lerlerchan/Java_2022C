import java.util.Scanner;

public class PropertySaleReport {
    private static String address = "";
    private static double price;
    private static double accumPrice = 0;
    private static final String HEADING1 = "MONTH-END SALES REPORT";
    private static final String HEADING2 = "Address\t\t\tPrice";
    private static final String QUIT = "ZZZ";

    public static void main(String[] args) {
        getReady();
        while (!address.equals(QUIT)) {
            createReport();
        }
        finishUp();
    }

    private static void finishUp() {
        System.out.println("Total sales: " + accumPrice);
    }

    private static void createReport() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter price of property: ");
        price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println(address + "\t\t\t" + price);
        accumPrice += price;

        System.out.println("Enter address of property (or enter ZZZ to quit): ");
        address = scanner.nextLine();
    }

    private static void getReady() {
        System.out.println(HEADING1);
        System.out.println(HEADING2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter address of property (or enter ZZZ to quit): ");
        address = scanner.nextLine();
    }
}
