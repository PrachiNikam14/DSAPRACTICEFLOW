// Bubble sort : push the max element to the last by swapping 2 indexes
// eg. first check element at index 0 and 1 if 0 is greater than 1 then swap both again 
// (if not keep it as it is) now check for index 1 and 2 and apply the same process.
package DSAPRACTICEFLOW.Day4;

public class algo2 {

    static void bubble_sort(int arr[] , int n){
        for(int i = n-1; i>=1 ; i--){
            boolean swapped = false;
            for(int j = 0 ;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                   int  temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;

                }
            }
             // Optimization: stop if array already sorted
            if(!swapped) {
                break;
            }
        }
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr []  = {20 ,9 ,56,48,13};
        bubble_sort(arr,n);
    }
}
