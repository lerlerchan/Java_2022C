import java.util.Scanner;

/**
 * class indefineLoop
 */
class IndefineLoop{
    public static void main(String[] args) {
        String shouldContinue;
        System.out.println("Do you want to continue? (y/n)");
        Scanner scanner = new Scanner(System.in);
        //scanner.next() returns a String
        shouldContinue = scanner.next();
        // loop condition tested
        while (shouldContinue.equals("y")) {
            //do this part
            System.out.println("Do you want to continue? (y/n)");
            shouldContinue = scanner.next();
        }
        System.out.println("Bye!");
    }
}