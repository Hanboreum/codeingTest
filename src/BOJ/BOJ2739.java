package BOJ;

import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<= N; i++){
            System.out.print(i);
            System.out.print("*");
            for(int j=i; j<=i; j++){
                System.out.print(j);
                System.out.println("=" + i*j);
            }
        }
    }
}
