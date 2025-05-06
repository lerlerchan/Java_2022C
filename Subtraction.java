import java.util.*;

public class Subtraction{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int count=0; count<5; count++){
            System.out.println("Enter a number: ");
            arr[count] = input.nextInt();
            sum -= arr[count];
        }
        System.out.println("The sum of the numbers are: "+sum);
        System.out.println("happy coding!");
    }
}