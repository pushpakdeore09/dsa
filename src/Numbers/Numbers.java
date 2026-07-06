package Numbers;

public class Numbers {
    public int getFactorialOf(int n){
        if(n == 0 || n == 1) return 1;
        return n*getFactorialOf(n-1);
    }
    public boolean isStringNumber(int n){
        int num = n;
        int sum = 0;
        while(num != 0){
            sum += getFactorialOf(num%10);
            num /= 10;
        }
        return sum == n;
    }
}
