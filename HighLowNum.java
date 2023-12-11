import java.util.Scanner;

public class HighLowNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int highestNumber = Integer.MIN_VALUE;  // Initializing to the smallest possible integer
        int lowestNumber = 0;  // Initialize to a positive value initially

        boolean firstNumberEntered = false;

        while (true) {
            System.out.println("Enter a number (negative to stop): ");
            number = scanner.nextInt();

            // Update highest and lowest numbers
            if (number < 0) {
                break;
            } else {
                if (!firstNumberEntered) {
                    lowestNumber = number;
                    firstNumberEntered = true;
                }

                if (number > highestNumber) {
                    highestNumber = number;
                } else if (number < lowestNumber) {
                    lowestNumber = number;
                }
            }
        }

        // Display results
        System.out.println("Highest number: " + highestNumber);
        System.out.println("Lowest number: " + lowestNumber);
    }
}
