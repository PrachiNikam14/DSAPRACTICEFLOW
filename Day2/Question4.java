// PS4 : "Given a string, check if the string is palindrome or not."  
//         A string is said to be palindrome if the reverse of the string is the same as the string.
package DSAPRACTICEFLOW.Day2;

public class Question4 {
    static boolean palindrome(String n){
        int left = 0;
        int right = n.length()-1;

        while(left<right){
            char l = n.charAt(left);
            char r = n.charAt(right);

            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(Character.isLowerCase(l) != Character.isLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;

            }
        }
        return true;
        }

    public static void main(String[] args) {
        
        String s = "Hello";
        boolean result = palindrome(s);
        if(result == true){
            System.out.println("Palindrome");}
        else{
                System.out.println("Not Palindrome");
            }
        }

    }
    

