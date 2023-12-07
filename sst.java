import java.util.Scanner;
class sst {
    public static void main(String[] args) {

       // System.out.println("\uD83D\uDC7D");
       System.out.println(":-) \n/ \\\n| |\n\\___/"); 

       // declare price
       double price;
       double total;
       //request userInput
       System.out.println("Provide an item price: ");
       Scanner userInput = new Scanner(System.in);
       //accept price
       price = userInput.nextDouble();
       //calculate total
       total = price *1.08;
       System.out.println("the total price with SST: " + total);
       
    }
}