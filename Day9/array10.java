// Intersection of two sorted arrays

package DSAPRACTICEFLOW.Day9;

import java.util.HashSet;

public class array10 {

    public static void Intersection(int arr1[],int arr2[],int n1, int n2){

        int i = 0;
        int j = 0;

        HashSet <Integer> set = new HashSet<>();

        while(i < n1 && j < n2){
            if(arr1[i] == arr2[j]){
                set.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        System.out.println("Intersection of two arrays are : " +set);
    }

    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5,5};

        int n1 = arr1.length;
        int n2 = arr2.length;

        Intersection(arr1, arr2, n1, n2);

    }
    
}
