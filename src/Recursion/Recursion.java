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
}
