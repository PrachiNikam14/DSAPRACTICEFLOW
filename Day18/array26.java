// Problem Statement: Given an array of N integers,
//  write a program to return an element that occurs more than N/2 times in the given array.
//  You may consider that such an element always exists in the array.(Better )
package DSAPRACTICEFLOW.Day18;

// import java.util.HashMap;
import java.util.*;

public class array26 {
    public static int majorityElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i<arr.length; i++){
            int v = map.getOrDefault(arr[i], 0);
            map.put(arr[i], v+1);
        }
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue() > (arr.length/2)){
                return i.getKey();

            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,2,2,1,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
