// Largest Element in an Array
package DSAPRACTICEFLOW.Day6;

public class array1 {
    public static void solution(int[] arr){
        int largest_element = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(largest_element < arr[i]){
                largest_element = arr[i];
                
            }
            
        }
        System.out.println("The Largest Element in an array is : " + largest_element);
    }
    public static void main(String[] args) {
        int arr [] = {20,8,5,6,27,30};
    
        solution(arr);
        
    }
    
}
