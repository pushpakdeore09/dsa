package Recursion;

public class Recursion {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(checkPalindrome(0, s, s.length()));
    }

    public static boolean checkPalindrome(int i, String s, int n){
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return checkPalindrome(i+1, s, n);
    }
}
