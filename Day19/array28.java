// Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
// has the largest sum and returns its sum and prints the subarray.(Brute force)
package DSAPRACTICEFLOW.Day19;

public class array28 {
    public static int sum(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            
            for(int j = i ; j<arr.length ; j++){
                int sum = 0;
                for(int k = i ; k <=j ;k++){
                    sum+=arr[k];
                    
                }
                maxi = Math.max(maxi,sum);
            }
    
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = sum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    
}
