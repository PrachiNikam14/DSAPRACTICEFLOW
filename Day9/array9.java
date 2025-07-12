// Union of two sorted arrays - Brute force 
package DSAPRACTICEFLOW.Day9;

import java.util.HashSet;

public class array9 {

    public static void Union(int arr1[], int arr2[] , int n1, int n2 ){
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0; i<n1; i++){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i< n2; i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
       
        int arr1 [] = {2,3,4,5,6};
        int arr2[]  = {1,2,5,6,7,8,9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        Union(arr1, arr2, n1, n2);

    }
    
}
