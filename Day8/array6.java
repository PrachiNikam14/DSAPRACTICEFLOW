// Move all Zeros to the end of the array
package DSAPRACTICEFLOW.Day8;

public class array6 {
    public static int[] MissingZero(int arr[]){
        int j = -1;
        for(int i = 0 ; i<arr.length ; i++){
           if( arr[i] == 0){
            j = i;
            break;
           }
            
        }
        if(j == -1){
            return arr;
        }

        for(int i = j + 1; i<arr.length ;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
               arr[j] = temp;
               j++;
            }
        }

        return arr;
    }
    public static void main(String args[]){
        int arr[] = {1,0,2,0,0,4};
        MissingZero(arr);
        System.out.println("Array after Sorting: ");
        for(int i = 0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
