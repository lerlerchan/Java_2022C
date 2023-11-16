import java.util.Scanner;
class SumTwoNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a+b==c || a+c==b || b+c==a){
            System.out.println("Sum of any numbers equal to the third");
        }
        else{
            System.out.println("False" + c +"sfsf");
        }
        
    }
}