package DSAPRACTICEFLOW.Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void Merge(int [] arr,int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

      while(left <= mid && right <= high){
        if(arr[left] <= arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
      }

      while(left<=mid){
        temp.add(arr[left]);
        left++;
      }

      while(right<=high){
        temp.add(arr[right]);
        right++;
      }

      for(int i = low;i<=high;i++){
        arr[i] = temp.get(i-low);
      }
    }

    public static void Merge(int arr[] , int low , int high){
        if(low>=high){
            return;
        }
        int mid  = (low+high)/2;
        Merge(arr, low, mid);
        Merge(arr, mid+1, high);
        Merge(arr, low, mid, high);

    }



    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = 7;
        int arr[] = { 2,3,1,2,5,4,8};
        System.out.println("Before Sorting : ");
        for(int i = 0 ;i< n ;i++){
            System.out.println(arr[i]+ " ");
        }

        System.out.println();
        Merge(arr, 0, n-1);

        System.out.println("After Sorting: ");
        for(int i = 0 ; i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
