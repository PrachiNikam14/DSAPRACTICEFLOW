// PS: Given an integer N, return true if it is a palindrome else return false.
package DSAPRACTICEFLOW.Day1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int N = sc.nextInt();
        System.out.println("The given Number is : " + N);
        int given_number = N;
        int last_digit, reversed_digit = 0;

        while(N>0){
            
            last_digit = N % 10;
            reversed_digit = (reversed_digit*10) + last_digit;
            N = N / 10;
        
        }
        System.out.println("The reversed number is : " + reversed_digit);
        if (reversed_digit == given_number){
            System.out.println("Truue");
        }
        else {
            System.out.println("false");
        }


    }
}
