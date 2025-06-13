// PS: You are given an array. The task is to reverse the array and print it. 
package DSAPRACTICEFLOW.Day2;

public class Question3 {
        public static void reversearray(int arr[],int n){
            int ans[] = new int[n];
            for(int i = 0 ; i< n ; i++){
                ans[i] = arr[n-i-1];
            }

            printarray(ans,n);

        }
        static void printarray(int[] ans, int n) {
            System.out.println("The reversed array is : \n");
            for(int i = 0 ; i< n ; i++){
                System.out.println(ans[i]);
            }
            
        }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {3,4,5,6,7};
        reversearray(arr,n);
    

    }
}
