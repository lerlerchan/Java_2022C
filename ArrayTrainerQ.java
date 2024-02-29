import java.util.Scanner;

public class ArrayTrainerQ{
    //declare an array size/ CONSTANT 25 named numbers
    private static int SIZE = 3;
    //declare an array of type String 
    private static String[] arrTrainerNames = new String[SIZE];
    //declare an array of type int
    private static int[] arrNewMembers = new int[SIZE];
    public static void main(String[] args){
        //get the trainer names and noMembers per trainer
        for(int count=0; count<SIZE; count++){
            arrTrainerNames[count]= getTrainerNames();
            arrNewMembers[count] = getNoMember();
        }
     
        //display number of members group by number of trainer
        displayData();

    }
    private static void displayData() {
        int numberOfTrainers=0;
        int numberOfTrainers2=0;
        int numberOfTrainers3 =0;
        int numberOfTrainers4 = 0;
        
        for(int count=0; count<SIZE; count++){
                //if number of members is 0-5, calculate the number of trainers
            if(arrNewMembers[count]>=0 && arrNewMembers[count]<=5){
                numberOfTrainers++;
            }
            else if(arrNewMembers[count]>=6 && arrNewMembers[count]<=12){
                numberOfTrainers2++;
            }
            else if(arrNewMembers[count]>=13 && arrNewMembers[count]<=20){
                numberOfTrainers3++;
            }
            else if(arrNewMembers[count]>20){
                numberOfTrainers4++;
            }
            else{
                System.out.println("Invalid input");
            }
        }
        System.out.println("Number of Members\t\tNumber of Trainers");
        System.out.println("-----------------\t\t-----------------");
        System.out.println("0 - 5"+"\t\t\t\t"+numberOfTrainers);
        System.out.println("6 - 12"+"\t\t\t\t"+numberOfTrainers2);
        System.out.println("13 - 20"+"\t\t\t\t"+numberOfTrainers3);
        System.out.println("Above 20"+"\t\t\t\t"+numberOfTrainers4);

    }
    
    private static String getTrainerNames() {
        System.out.println("Please enter the trainer names:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
      
    }

    private static int getNoMember(){
        System.out.println("Please enter the number of new members:");
        Scanner input = new Scanner(System.in);
        int newMembers = input.nextInt();
        return newMembers;
    }

}