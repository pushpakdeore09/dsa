package Numbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public int getFactorialOf(int n){
        if(n == 0 || n == 1) return 1;
        return n*getFactorialOf(n-1);
    }
    public boolean isStrongNumber(int n){
        int num = n;
        int sum = 0;
        while(num != 0){
            sum += getFactorialOf(num%10);
            num /= 10;
        }
        return sum == n;
    }
    public boolean isArmStrongNumber(int n){
        if(n <= 9) return true;
        int num = n;
        int len = 0;
        while(num != 0){
            len++;
            num /= 10;
        }
        num = n;
        int sum = 0;
        while(num != 0){
            sum += (int) Math.pow(num%10, len);
            num /= 10;
        }
        return sum == n;
    }
    public boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            sum += (n % i == 0) ? i : 0;
        }
        return sum == n;
    }
    public boolean isPerfectSquare(int n){
        return Math.sqrt(n) % 1 == 0;
    }
    public boolean isPerfectCube(int n){
        return Math.cbrt(n) % 1 == 0;
    }
    public boolean isPalindrome(int n){
        if(n <= 9) return true;
        int num = n;
        int rev = 0;
        while(num != 0){
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        return rev == n;
    }
    public boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if(n == 2) return  true;
        if(n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean isPalindromicPrime(int n){
        return isPalindrome(n) && isPrime(n);
    }
    public int reverseInteger(int n){
        if(n <= 9) return n;
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        return rev;
    }
    public boolean isPrimeTwistNumber(int n){
        int rev = reverseInteger(n);
        return isPrime(n) && isPrime(rev);
    }
    public int NthPerfectSquare(int n) {
        return n*n;
    }
    public int NthPerfectCube(int n) {
        return n*n*n;
    }
    public List<Integer> firstNthPerfectSquareAndCube(int n){
        int count = 0;
        int num = 1;
        List<Integer> result = new ArrayList<>();
        while(count < n){
            if(isPerfectSquare(num) && isPerfectCube(num)){
                result.add(num);
                count++;
            }
            num++;
        }
        return result;
    }
    public int NthPalindromicPrime(int n){
        int count = 0;
        int num = -1;
        while(count < n){
            if(isPalindromicPrime(++num)) count++;
        }
        return num;
    }
    public int NthPrimeAndTwist(int n){
        int count = 0;
        int num = -1;
        while(count < n){
            if(isPrimeTwistNumber(++num)) count++;
        }
        return num;
    }
    public int lastDigit(int n){
        return n % 10;
    }
    public int secondLastDigit(int n){
        return (n/10) % 10;
    }
    public int firstDigit(int n){
        while(n >= 10) n /= 10;
        return n;
    }
    public int secondDigit(int n){
        while(n >= 100) n /= 10;
        return n % 10;
    }
    public int sumOfDigits(int n){
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public double avgOfDigits(int n){
        double sum = 0;
        double len = 0;
        while(n != 0){
            sum += n % 10;
            len++;
            n /= 10;
        }
        return (sum/len);
    }
    public int firstAndLastDigit(int n){
        return (10 * firstDigit(n)) + lastDigit(n);
    }
    public int appendSumAtEndOfDigit(int n){
        int sum = sumOfDigits(n);
        int temp = sum;
        while(temp != 0){
            n *= 10;
            temp /= 10;
        }
        return sum + n;
    }
    public int appendSumAtStartOfDigit(int n){
        int sum = sumOfDigits(n);
        int temp = n;
        while(temp != 0){
            sum *= 10;
            temp /= 10;
        }
        return sum + n;
    }
    public int shiftLastDigitToFirst(int n){
        int lastDigit = n % 10;
        int num = n/10;
        while(n > 9){
            lastDigit *= 10;
            n /= 10;
        }
        return lastDigit+num;
    }
    public int shiftFirstDigitToLast(int n){
        int num = n;
        int temp = 1;
        while(n > 9){
            n /= 10;
            temp *= 10;
        }
        return ((num % temp)*10) + n;
    }
    public int swapFirstAndLastDigit(int n){
        int lastDigit = n % 10;
        int firstDigit = n;
        int temp = 1;
        while(firstDigit > 9){
            firstDigit /= 10;
            temp *= 10;
        }
        int middle = (n % temp) / 10;
        return (lastDigit*temp) + (middle*10) + firstDigit;
    }
    public int separateOddAndEvenDigit(int n){
        int odd = 0;
        int even = 0;
        int oddPower = 1;
        int evenPower = 1;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 != 0){
                odd = (digit * oddPower) + odd;
                oddPower *= 10;
            } else {
                even = (digit * evenPower) + even;
                evenPower *= 10;
            }
            n /= 10;
        }
        return (odd*evenPower) + even;
    }
    public int maxDigitInNumber(int n){
        int maxDigit = n % 10;
        while(n != 0){
            maxDigit = Math.max(maxDigit, n%10);
            n /= 10;
        }
        return maxDigit;
    }
    public int replaceZeroWithOddDigit(int n){
        int result = 0;
        int power = 1;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 != 0) digit = 0;
            result = (digit * power) + result;
            power *= 10;
            n /= 10;
        }
        return result;
    }
}
