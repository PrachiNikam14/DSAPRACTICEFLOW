// Ps:  Given a number ‘N’, find out the sum of the first N natural numbers.
package DSAPRACTICEFLOW.Day2;

public class Question1 {
    static int N = 5;
    static int sum = 0;
     
   

    public static void printname(){
        for(int i  = N ; i>0 ; i--){
            System.out.println(i);
            sum = i + sum;
        }
        System.out.println("Sum of " + N + "digits are : " + sum);
    }

    public static void main(String[] args) {
        
        printname();
        
    }
}
