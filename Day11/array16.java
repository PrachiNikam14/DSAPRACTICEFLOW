// Find the Number that appears once and others twice
package DSAPRACTICEFLOW.Day11;

public class array16 {
    public static int NumOnce(int arr[]){
        for(int  i =0 ; i<arr.length; i++){
            int num = arr[i];
            int cnt = 0;
            for(int j = 0 ; j<arr.length;j++){
                if(arr[j] == num){
                    cnt++;}

            }
            if(cnt == 1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1,1,2,3,3,4,4};
        int ans = NumOnce(arr);
        System.out.println(ans);
    }
}
