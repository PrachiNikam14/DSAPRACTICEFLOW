// Missing number - optimal approach 1 using sum
package DSAPRACTICEFLOW.Day10;

public class array13 {
    public static int MissingNum(int arr[] , int n){
        int expected_sum = (n * (n+ 1)) /2;

        int sum = 0;
        for(int i = 0;i< n - 1 ; i++){
            sum = sum + arr[i];

        }
        return expected_sum - sum;

    }

    public static void main(String[] args) {
    
        int arr[] = {1,2,3,5};
        int n = 5;
        int result = MissingNum(arr, n);
        System.out.println(result);
    }
    
}
