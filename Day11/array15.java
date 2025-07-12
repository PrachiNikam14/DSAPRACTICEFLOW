// Maximum consecutive ones 
package DSAPRACTICEFLOW.Day11;

public class array15 {

    public static int MaxOnes(int arr[]){
        int max1 = 0;
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt++;
                max1 = Math.max(max1,cnt);
            }
            else{
                cnt = 0;
            }
        }
        return max1; 
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,0,1,1};
       int ans = MaxOnes(arr);
       System.out.println(ans);
    }
}
