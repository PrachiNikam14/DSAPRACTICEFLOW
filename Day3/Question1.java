// PS1 : Given an array, we have found the number of occurrences of each element in the array.
package DSAPRACTICEFLOW.Day3;

import java.util.Scanner;

public class Question1 {   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0 ; i<n ; i++){
             arr[i] = sc.nextInt();
        }

        int i;
        int hash[] = new int[13];
        for(i = 0; i< n ;i++){
            hash[arr[i]]++;
        }


        // find the no. of queries
        int q;
        System.out.println("Enter the number of entries: ");
        q  = sc.nextInt();
        while(q-->0){
            System.out.println("Enter the Numbers to check in an array : ");
            int num = sc.nextInt();
            System.out.println("The hash Frequency: ");
            System.out.println(hash[num]);
            
        }

    }
}
