import java.util.Scanner;

public class ArrayQ2 {
    //declare an array size 20 named numbers
    private static int SIZE = 3;
    private static int[] arrNumbers = new int[SIZE];
    //declare a userinput variable
    private static int userInput = 0;

    public static void main(String[] args) {
        
        for(int i=0; i<SIZE; i++){
            getUserInput(i);
        }

        //count the average of the elements in the array
        int average = getAverage();
        System.out.println("The average of the elements in the array is: "+average);
        
        displayData(average);

        
    }

    private static void displayData(int average) {
        System.out.println("count\t\tElement\t\tDiffernce From Average");
        System.out.println("-----\t\t-------\t\t---------------------");
        for(int count=0; count<SIZE; count++){
          System.out.println(count +"\t\t"+arrNumbers[count]+"\t\t"+ (average-arrNumbers[count]));
        }
    }

    private static int getAverage() {
        int sum = 0;
        for(int i=0; i<SIZE; i++){
            sum += arrNumbers[i];
        }   
        int average = sum/SIZE;
        return average;
    }

    private static void getUserInput(int i) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();
        arrNumbers[i] = userInput;
    }
    
}
