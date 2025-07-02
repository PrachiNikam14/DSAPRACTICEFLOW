// Second Largest Element in an Array without sorting
package DSAPRACTICEFLOW.Day6;

public class array2 {

    public static void solution(int []arr){
        int Largest = Integer.MIN_VALUE; 
        int Second_largest = Integer.MIN_VALUE;
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i] > Largest){
                Second_largest = Largest;
                Largest=arr[i];

            }
            else if(arr[i] > Second_largest && arr[i] != Largest){
                Second_largest = arr[i];
            }
            }
            System.out.println("Largest element is: "+Largest );
              if (Second_largest != Integer.MIN_VALUE) {
            System.out.println("Second Largest Element is: " + Second_largest);
        } else {
            System.out.println("Second Largest Element not found (maybe all elements are equal).");
        }
    }

        
        
    
    public static void main(String[] args) {
        int arr[] = {20,70,46,55,78};
        System.out.println("The given array is: ");
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        solution(arr);
    }
}
