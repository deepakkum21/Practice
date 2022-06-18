package Recursion;

// https://www.codingninjas.com/codestudio/problems/check-palindrome_4219630
public class CheckPalindrome {

    // recursive approach
    public static Boolean Recursive(String s) {
        if(s.length()>0) {
            return helperRecursivePalindrome(s, 0,s.length()-1);
        }
        return false;
    }

    private static Boolean helperRecursivePalindrome(String s, int left, int right) {
        if(left>=right) {
            return true;
        }

        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return helperRecursivePalindrome(s, left+1,right-1);
    }



    // normal approach
    public static Boolean isPalindrome(String s) {
        char[] stringChar = s.toCharArray();
        int left = 0;
        int right = stringChar.length-1;
        while(left != s.length()/2) {
            if(stringChar[left]!=(stringChar[right])) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Recursive("madam"));
    }
}
