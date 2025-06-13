// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
package DSAPRACTICEFLOW.Day2;

public class Question5 {

    static void Fibonacci(int n){
        
        if(n<=0){
            System.out.println(0); 
        }
        else{
            int last = 1;
            int slast = 0;
            
            System.out.println(slast + " \n" + last);
            int cur ;
            for(int i = 2; i<=n ; i++){
                cur = last + slast;
                slast = last;
                last = cur;
                
                System.out.println(cur);
          

        }}

        
    }
    public static void main (String args[]){
        int n = 10;
        Fibonacci(n);
    }
    
}
