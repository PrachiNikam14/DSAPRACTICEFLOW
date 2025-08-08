// Problem Statement: Given an array of N integers,
//  write a program to return an element that occurs more than N/2 times in the given array.
//  You may consider that such an element always exists in the array.(Brute force)

package DSAPRACTICEFLOW.Day17;

public class array25 {

    public static int majorityElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;

                }
            }
            if (cnt > (arr.length / 2)) {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 5, 6, 2, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println(ans);

    }

}
