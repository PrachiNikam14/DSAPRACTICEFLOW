// Selection Sort 
// start from index 1 assuming it is smaller then check for smaller element than on index 1 
// and swap with that . 
package DSAPRACTICEFLOW.Day4;

import java.util.Scanner;

class algo1 {

    static void selection_sort(int arr[] , int n){
        for(int i = 0; i<=n-2 ; i++){
            int min = i ;
            // here j will start from i+1 to remove unnecessary swapping when j == i
            for(int j = i+1 ; j<=n-1 ; j++){     
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
        System.out.println("After selection sort : ");
        for(int i = 0 ;i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        selection_sort(arr, n);

    }
}
