import java.util.Scanner;
 class compare{
    public static void main(String[] args) {
        //declaration
        int num1;
        int num2;

        Scanner userInput = new Scanner(System.in);
        //prompt 
        System.out.println("Please provide 1 number:");
        num1= userInput.nextInt();

        System.out.println("Please provide second number:");
        num2= userInput.nextInt();

        if(num1 > num2){
            System.out.println("First is larger");
        }
        else if(num2 > num1){
            System.out.println("Second is larger");
        }
        else{
            System.out.println("Numbers are equal");
        }
    }
 }