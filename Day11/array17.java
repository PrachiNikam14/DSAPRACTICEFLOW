// // Find the Number appears once and others twice
package DSAPRACTICEFLOW.Day11;

public class array17 {
    
    public static int NumOnce(int arr[]){
        int max1 = 0;
        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
            max1 = Math.max(num, max1);
        }

        int[] Hash = new int [max1+1];
        for(int i = 0;i<arr.length;i++){
            Hash[arr[i]]++;
        }

        for(int i = 0; i<arr.length;i++){
            if(Hash[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,3,4,4,5};
        int ans = NumOnce(arr);
        System.out.println(ans);
        
    }
}
