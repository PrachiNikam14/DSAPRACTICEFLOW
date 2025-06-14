//  PS2 : (character hashing) if the string contains both uppercase and lowercase.
package DSAPRACTICEFLOW.Day3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the string: ");
   String s = sc.next();

//    hashing
int []hash = new int[256];
for(int i = 0 ; i<s.length() ; i++){
    hash[s.charAt(i)]++;

}
int q; 
System.out.println("Enter the number of entries to check: ");
q = sc.nextInt();
while(q-->0){
    char c ;
    System.out.println("Enter the Characters: ");
    c = sc.next().charAt(0);
    System.out.println("The frequency of Character are: ");
    System.out.println(hash[c]);

}

}

}