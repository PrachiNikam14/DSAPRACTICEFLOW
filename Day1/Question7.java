// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.(using Euclidean algorithm)
// gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15) = gcd (0,5) hence the gcd is 5 ;
package DSAPRACTICEFLOW.Day1;

public class Question7 {

    static int gcd(int a , int b){
    while(a>0 && b>0){
        if(a>b){
            a = a% b;
        }
        else{
            b = b% a;
        }
    }
     if (a==0){
            return b;
        }

        return b;
}
    public static void main(String[] args) {
        int n1 = 16 , n2 =20;
        System.out.println("The 2 numbers are : " + n1 + " " +n2);
        int gcd = gcd(n1, n2);

        System.out.println("The GCD of 2 numbers are : " + gcd);
    }
    
}
