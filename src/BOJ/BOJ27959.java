package BOJ;

import java.util.Scanner;

public class BOJ27959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mul = N * 100;

        if ( mul >= M){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
