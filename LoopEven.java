class LoopEven{
    public static void main(String[] args){
        //initiate loop variable
        int i = 1;
        //loop condition
        while(i <= 200){
            //if the number is even, print it
            if(i % 2 == 0){
                System.out.println(i);
            }
            //increment the loop variable
            i++;
        }
    }
}