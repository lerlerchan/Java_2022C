//import the scanner library
import java.util.Scanner;
class ArrayQ1{
    public static void main(String[] args) {
        // declare an array size 20 named numbers
        int[] numbers = new int[5];
        //declare a userinput variable
        int userInput = 0;
        Scanner input = new Scanner(System.in);

        // allows users to input 20 numbers
        for (int i = 0; i < numbers.length; i++) {
            //request input from user
            System.out.println("Please enter a number:");
            //transfer input to userInput variable
            userInput = input.nextInt();
            //store it in the array
            numbers[i] = userInput;
        }

        //dislay the numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i +"\t\t"+numbers[i]);
        }

        //display the elements of array in reverse order
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(i +"\t\t"+numbers[i]);
        }
    }
}