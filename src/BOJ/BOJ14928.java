package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ14928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b = sc.nextBigInteger();
        BigInteger c = new BigInteger("20000303");

        System.out.println(b.remainder(c));
    }
}
