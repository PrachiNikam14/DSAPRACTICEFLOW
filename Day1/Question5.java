// Problem Statement: Given an integer N, return all divisors of N.
package DSAPRACTICEFLOW.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i<=sqrt ; i++){
           if( n % i == 0){
            divisors.add(i);

            if (i!=n/i){
                divisors.add(n/i);
            }
           }

        }
        Collections.sort(divisors); 
        
        System.out.println("The divisors are : ");
        for (int i : divisors){
            System.out.println(i);
        }

        System.out.println();
    }
    
}
