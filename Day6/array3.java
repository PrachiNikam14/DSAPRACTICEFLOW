package DSAPRACTICEFLOW.Day6;

public class array3 {
    public static boolean solution(int arr[]){
        for(int i = 1;i<arr.length ; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] = {1,2,10,5,6};
        boolean result = solution(arr);
        if (result==true){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
    }
}
