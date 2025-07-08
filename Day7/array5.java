// Problem Statement: Given an array of N integers, left rotate the array by one place.
package DSAPRACTICEFLOW.Day7;

public class array5 {
    public static void LeftRotate(int arr[]){
        int temp = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        LeftRotate(arr);
        for(int  i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
