// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
package DSAPRACTICEFLOW.Day1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N, sum = 0;
        int k =  String.valueOf(num).length();
        System.out.println("The length of the given number is : " + k);
        
        while(N>0){
            int last_digit = N % 10;
            sum = (int) (sum + Math.pow(last_digit,k));
            N = N / 10;
        }

        if (num == sum){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
