// Missisng num - optimal approach 2 using XOR
package DSAPRACTICEFLOW.Day10;

public class array14 {
    public static int MissingNum(int arr[], int N){
        int XOR1 = 0 , XOR2 = 0;

        for(int i = 0; i< N-1;i++){
            XOR2 = XOR2 ^ arr[i];
            XOR1 = XOR1 ^ (i + 1);}

            XOR1 = XOR1 ^ N;

            return (XOR1 ^ XOR2);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = 5;
        int result = MissingNum(arr, n);
        System.out.println(result);
    }
}
