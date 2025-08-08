// Problem Statement: Given an array of N integers,
//  write a program to return an element that occurs more than N/2 times in the given array.
//  You may consider that such an element always exists in the array.(Optimal)
package DSAPRACTICEFLOW.Day18;

public class array27 {
    public static int majorityElement(int arr[]){
        int cnt = 0;
        int el = 0;

        for(int i = 0; i<arr.length; i++){
            if(cnt == 0){
                cnt = 1;
                el = arr[i];
            }
            else if(el == arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == el){
                cnt1++;
            }
        }
        if(cnt1 > (arr.length/2)){
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,1,2,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    
}
