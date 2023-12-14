import java.util.Scanner;

public class ArrayQ3{
    private static int SIZE = 3;
    private static int[] arrNumbers = new int[SIZE];
    private static int userInput = 0;

    public static void main(String[] args){

        for(int count=0; count<SIZE; count++){
            getUserInput(count);
        }

        displayAllNumbers();
        displayTheLargestNumber();
        displayTheSmallestNumber();
    }

    private static void displayTheSmallestNumber() {
        int smallestNumber = arrNumbers[0];
        for(int count=0; count<SIZE; count++){
            if(arrNumbers[count]<smallestNumber){
                smallestNumber = arrNumbers[count];
            }
        }
        System.out.println("The smallest number is: "+smallestNumber);
    }

    private static void displayTheLargestNumber() {
        int largestNumber = arrNumbers[0];
        for(int count=0; count<SIZE; count++){
            if(arrNumbers[count]>largestNumber){
                largestNumber = arrNumbers[count];
            }
        }
        System.out.println("The largest number is: "+largestNumber);
    }

    private static void displayAllNumbers() {
        System.out.println("The numbers you entered are:");
        for(int count=0; count<SIZE; count++){
            System.out.println(count+"\t\t"+arrNumbers[count]);
        }
    }

    private static void getUserInput(int count) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();
        arrNumbers[count] = userInput;
    }
}