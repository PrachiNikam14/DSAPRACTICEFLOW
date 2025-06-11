// Problem Statement: Given an integer N, return the number of digits in N.
package DSAPRACTICEFLOW.Day1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("The given Number is N: " +N);
        int count = 0;
        while(N>0){
            count ++;
            N=N/10;
        }
        System.out.println("The number of digits are : " +count);
        
    }

}
