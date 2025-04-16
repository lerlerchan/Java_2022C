import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int product = num1 * num2;
        System.out.println("The product of the two numbers is: " + product);
    }

   // create a functions to multiply 2 numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // create a function to multiply 3 numbers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // create a function to multiply 4 numbers
    public static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

}