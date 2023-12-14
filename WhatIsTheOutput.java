class WhatIsTheOutput {
    public static void main(String[] args) {
        int j =2;
        int k =5;
        int n =9;
        int m =0;
        while (j<k){
           m=6;
            while (m<n) {
                System.out.println("GoodBye");
                m=m+1;
            }
            j=j+1;
        }
        System.out.println("j="+j+" k="+k+" m="+m+" n="+n+"");
    }
}