package BOJ;

import java.util.Scanner;

public class BOJ29725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;

        for(int i = 0; i < 8; i++) {
            String a = sc.next();
            for(int j = 0; j < a.length(); j++) {
                if(a.charAt(j) == 'K') {
                    count += 0;
                }else if(a.charAt(j) == 'P') {
                    count += 1;
                }else if(a.charAt(j) == 'N') {
                    count += 3;
                }else if(a.charAt(j) == 'B') {
                    count += 3;
                }else if(a.charAt(j) == 'R') {
                    count += 5;
                }else if(a.charAt(j) == 'Q') {
                    count += 9;
                }else if(a.charAt(j) == 'k') {
                    count -= 0;
                }else if(a.charAt(j) == 'p') {
                    count -= 1;
                }else if(a.charAt(j) == 'n') {
                    count -= 3;
                }else if(a.charAt(j) == 'b') {
                    count -= 3;
                }else if(a.charAt(j) == 'r') {
                    count -= 5;
                }else if(a.charAt(j) == 'q') {
                    count -= 9;
                }
            }
        }

        System.out.println(count);
    }
}
//백 -흑 = 점수
//백 대문자, 흑  소문자
//. = 0 .,K, k = 0, P, p=2 N, n=3 B, b=3 R, r=5 Q, 9
