// Missing Number from 1 to N in an array.- Brute force
package DSAPRACTICEFLOW.Day9;

public class array11 {

    public static int MissingNum(int arr[],int n){
        for(int i = 1; i<=n ; i++){
            int flag = 0;
            for(int j = 0 ;j <n-1 ; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
                if(flag == 0){
                    return i;
                }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,4,5};
        int result = MissingNum(arr, n);
        System.out.println(result);

    }
}
