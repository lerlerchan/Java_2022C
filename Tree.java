import java.util.Scanner;

class Tree{
    public static void main(String[] args){
        //declaration of variables
        int value;
        int total;
        //request user to input a value
        System.out.println("Please enter a value: ");
        //read the value
        Scanner userInput = new Scanner (System.in);
        //store the value
        value = userInput.nextInt();
        //calculate the value
        total = value*2;
        //display the result
        System.out.println("The result is: ");
        //display the result
        System.out.println(total);
  
    }
}