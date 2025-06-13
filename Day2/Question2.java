// PS: Given a number X,  print its factorial.(using parameterized recursion)
package DSAPRACTICEFLOW.Day2;

public class Question2 {

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }
}
