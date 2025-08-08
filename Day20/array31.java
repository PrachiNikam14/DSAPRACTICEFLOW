// Our approach is to store the starting index and the ending index of the subarray. 
// Thus we can easily get the subarray afterward without actually storing the subarray elements.
package DSAPRACTICEFLOW.Day20;

public class array31 {
    public static long maxSubarraySum(int arr[]){
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        int start = 0;
        int ansStart= -1;
        int ansEnd = -1;

        for(int i = 0; i< arr.length;i++){
            if(sum == 0){
                start = i;
            }
            sum+=arr[i];

            if(sum>maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;

            }

            if (sum < 0) {
                sum = 0;
            }


        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");


        return maxi;
    }

     public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
