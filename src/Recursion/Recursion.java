package Recursion;

public class Recursion {

    public boolean checkPalindrome(int i, String s, int n){
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return checkPalindrome(i+1, s, n);
    }

    public void printOneTOn(int n){
        if (n > 0){
            printOneTOn(n-1);
            System.out.println(n);
        }
    }

    public void printNTOOne(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNTOOne(n-1);
    }

    public String reverseString(String s){
        if(s.length() == 0) return "";
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public int reverseInteger(int n, int rev){
        if(n == 0) return rev;
        rev = rev * 10 + (n % 10);
        return reverseInteger(n / 10, rev);
    }

    public int sumOfDigits(int n){
        if(n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

}
