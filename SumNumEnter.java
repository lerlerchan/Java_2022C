//import the library
import java.util.Scanner;

class SumNumEnter{
    public static void main(String[] args){
        //initiate variables
        int sum = 0;
        int num = 0;
        //request scanner input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        //loop through the usrinput number
        for(int i = 0; i <= num; i++){
            //accumulate sum with user input number
            sum=sum+i;
        }
        //output sum
        System.out.println("Sum of all numbers: " + sum);
    }
}