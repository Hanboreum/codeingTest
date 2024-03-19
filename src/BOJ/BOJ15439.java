package BOJ;

import java.util.Scanner;

public class BOJ15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println( N * (N -1 ));
    }
}
//자기 자신과 같은 색이 아닌 N -1 개의 색상을 고를 수 있다
//