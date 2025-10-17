package Patterns;

public class Pattern {

    /* Output */
    /*
     *****
     *****
     *****
     *****
     *****
     */
    public void print1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
     *
     **
     ***
     ****
     *****
     */
    public void print2(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    1
    12
    123
    1234
    12345
    */
    public void print3(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    1
    22
    333
    4444
    55555
    */
    public void print4(int n){
        for(int i=0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    /* Output */
    /*
     *****
     ****
     ***
     **
     *
     */
    public void print5(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j <n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /* Output */
    /*
    12345
    1234
    123
    12
    1
    */
    public void print6(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j < n-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    /* Output */
    /*     *
          ***
         *****
        *******
       *********
     */
    public void print7(int n){
        for(int i=0; i < n; i++){
            //space
            for(int j=0; j < n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j < 2*i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
     *********
      *******
       *****
        ***
         *
     */
    public void print8(int n){
        for(int i=0; i < n; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j< i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
     */
    public void print9(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j< n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i< n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     */
    public void print10(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i< n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    1
    01
    101
    0101
    10101
     */
    public void print11(int n){
        int num = 1;
        for(int i=0; i<n; i++){
            if(i % 2 == 0) {
                num=1;
            }else num=0;
            for(int j=0; j<=i; j++){
                System.out.print(num);
                num=1-num;
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    public void print12(int n){
        int num=1;
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    A
    AB
    ABC
    ABCD
    ABCDE
     */
    public void print13(int n){
        char c = 'A';
        for(int i=0; i<=n; i++){
            for(int j=0; j< i; j++){
                char next = (char) (c+j);
                System.out.print(next);
            }
            System.out.println();
        }
    }
    /* Output */
    /*
    ABCDE
    ABCD
    ABC
    AB
    A
     */
    public void print14(int n){
        char c = 'A';
        for(int i=0; i< n; i++){
            for(int j=0; j<n-i; j++){
                char next = (char) (c+j);
                System.out.print(next);
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    A
    BB
    CCC
    DDDD
    EEEEE
     */
    public void print15(int n){
        char c = 'A';
        for(int i=0; i< n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c);
            }
            c = (char) (c+1);
            System.out.println();
        }
    }

    /* Output */
    /*
    1        1
    12      21
    123    321
    1234  4321
    1234554321
     */
    public void print16(int n){
        for(int i=0; i< n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            for(int j=0; j<(2*(n-i-1)); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    /* Output */
    /*
        A
       ABA
      ABCBA
     ABCDCBA
     */
    public void print17(int n){

        for(int i=0; i<n; i++){
            char c = 'A';
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i-1; j++){
                System.out.print(c);
                c+=1;
            }
            for(int j=0; j<i; j++){
                System.out.print(c);
                c-=1;
            }
            System.out.println();
        }
    }

    /* Output */
    /*
    E
    DE
    CDE
    BCDE
    ABCDE
     */
    public void print18(int n){
        for(int i=0; i<n; i++){
            char c = (char) ('A' + (n - i - 1));
            for(int j=0; j<=i; j++){
                System.out.print((char)(c+j));

            }
            System.out.println();
        }
    }

    /* Output */
    /*
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     */
    public void print19(int n){
        for(int i=0; i<n/2; i++){
            for(int j=0; j<(n/2)-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(n/2)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n/2; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<(n-(2*i))-2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     */
    public void print20(int n){
        for(int i=0; i<(n/2)-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<(n-(2*i))-2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<(n/2); i++){
            for(int j=0; j<(n/2)-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(n/2)-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Output */
    /*
     *****
     *   *
     *   *
     *   *
     *****
     */
    public void print21(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i== n-1 || j== n-1){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
