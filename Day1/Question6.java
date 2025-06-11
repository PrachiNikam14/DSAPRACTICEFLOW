// Problem Statement: Given an integer N, check whether it is prime or not.
package DSAPRACTICEFLOW.Day1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int N  =  sc.nextInt();
        int k  =  (int)Math.sqrt(N);
        int count = 0;

        for(int i = 1 ;  i<=k;i++){
            if(N%i==0){
                count++;

                if(N/i !=i){
                    count++;
                }
            }
        }
         if(count == 2){
                System.out.println("its prime number");
            }
            else{
                System.out.println("Not prime number");
            }
        
        
    }
}
