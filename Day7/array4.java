// Remove duplicates from Sorted array
// Optimal is solved on leetcode
package DSAPRACTICEFLOW.Day7;
import java.util.HashSet;

public class array4 {
      static int removeduplicates(int arr[]){
            HashSet <Integer> set = new HashSet <>();
            for(int i = 0 ; i<arr.length; i++){
                set.add(arr[i]);
            }
            int k = set.size();
        // """Iterates through each element x in the set.

        // Assigns each x to arr[j], then increments j by 1.

        // This effectively copies elements from the set back into the arr[] starting at index 0."""


            int j = 0;
            for(int x : set){
                arr[j++] = x; 
            }
            return k;
        }

    public static void main(String args[]){
       
        int arr[] = {1,2,3,1,2,3,4,5};
        int k = removeduplicates(arr);
        System.out.println("The array after removing duplicates: ");
        for(int i = 0; i<k;i++){
            System.out.println(arr[i] + " ");
        }

       
    }
}
