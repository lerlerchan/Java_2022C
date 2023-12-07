import java.util.Scanner;

class IndefineLoop{
    public static void main(String[] args) {
        String shouldContinue;
        System.out.println("Do you want to continue? (y/n)");
        Scanner scanner = new Scanner(System.in);

        shouldContinue = scanner.next();
        while (shouldContinue.equals("y")) {
            System.out.println("Do you want to continue? (y/n)");
            shouldContinue = scanner.next();
        }
        System.out.println("Bye!");
    }
}