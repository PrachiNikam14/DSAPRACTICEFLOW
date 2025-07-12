// Missing Number - Better approach using Hashing
package DSAPRACTICEFLOW.Day10;

import java.util.HashSet;

public class array12 {

    public static int MissingNum(int arr[] , int n){
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0 ; i< n-1 ;i++){
            set.add(arr[i]);
        }
        for(int i = 1;i<n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,4,5};
        int result = MissingNum(arr, n);
        System.out.println(result);

    }

}
