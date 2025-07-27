 // Two Sum : Check if a pair with given sum exists in Array - Better (Hashing returning yes or no)
package DSAPRACTICEFLOW.Day13;

import java.util.HashMap;

public class array20 {

    public static String Twosum(int arr[], int target){
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int nums = arr[i];
            int moreneeded = target - nums;
            if(mpp.containsKey(moreneeded)){
                return "yes";
            }
            mpp.put(arr[i], i);
            
        }

        return "no";
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = Twosum( arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
