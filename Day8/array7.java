// linear search
package DSAPRACTICEFLOW.Day8;

public class array7 {
    public static void LinearSearch(int arr[],int n){
        int num = n;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("Element found at index : "+ i );
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        LinearSearch(arr, 5);

    }
}
