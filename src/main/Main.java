// https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d/train/java

package main;

public class Main {

    public static int halvingSum ( int n ) {
        int sum = 0;

        while (n > 0){
            sum += n;
            n /= 2;
        }

        return sum;
    }

    public static void main ( String[] args ) {
        System.out.println ( halvingSum ( 25 ) );
    }
}
