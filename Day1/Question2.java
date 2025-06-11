// Problem  Statement: Given an integer N return the reverse of the given number.

package DSAPRACTICEFLOW.Day1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("The given Number : " + N);
        int lastdigit, reversed_digit = 0;
        while(N>0){
            lastdigit = N % 10;
            N = N/ 10;
            reversed_digit = (reversed_digit*10)+ lastdigit;

        }
        System.out.println("The reversed Number is : " + reversed_digit);
    }
}
