// insertion sort 
package DSAPRACTICEFLOW.Day4;

public class algo3 {
    static void insertion_sort(int arr[] , int n){
        for ( int i = 0 ; i<=n-1; i++){
            int j = i;
            while(j>0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]=temp;
                j--;

            }
        }
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr []  = {20 ,9 ,56,48,13};
        insertion_sort(arr,n);
    }
}
