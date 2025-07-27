// Two Sum : Check if a pair with given sum exists in Array - Brute force(Return Indices)
package DSAPRACTICEFLOW.Day12;

public class array19 {

    public static int[] TwoSum(int arr[], int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
    
     }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = TwoSum(arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "+ ans[1] + "]");
        
    }
}
