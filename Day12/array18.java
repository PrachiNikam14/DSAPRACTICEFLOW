// Two Sum : Check if a pair with given sum exists in Array - Brute force(Return Yes or No)
package DSAPRACTICEFLOW.Day12;


public class array18 {

    public static String TwoSum(int arr[],int Target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j<arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i]+arr[j] == Target){
                    return "Yes";
                }
            }
            
        }
        return "No";
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = TwoSum( arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

}
