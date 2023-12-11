import java.util.Scanner;

class SumUpUserInputNumber{
    public static void main(String[] args){
        //initiate variables
        int sum = 0;
        int num = 0;
        //request scanner input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        //while loop to add numbers
        while(num != 0){
            //accumulate sum with user input number
            sum+=num;
            System.out.println("Enter a number: ");
            num = sc.nextInt();
        }
        //display sum
        System.out.println("Sum of all numbers: " + sum);
    }
}