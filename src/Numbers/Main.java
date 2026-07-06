package Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numbers numbers = new Numbers();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(numbers.replaceZeroWithOddDigit(n));
    }
}
