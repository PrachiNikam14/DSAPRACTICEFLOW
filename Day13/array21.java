 // Two Sum : Check if a pair with given sum exists in Array - Better (Hashing returning indices)

package DSAPRACTICEFLOW.Day13;

import java.util.HashMap;

public class array21 {
    public static int[] Twosum(int arr[] , int target){
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap <Integer,Integer > mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           int nums = arr[i];
           int moreneeded = target - nums;
           if(mpp.containsKey(moreneeded)){
            ans[0] = mpp.get(moreneeded);
            ans[1] = i;
            return ans;
           }
            mpp.put(arr[i],i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = Twosum(arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "+ ans[1] + "]");

        
    }
}
