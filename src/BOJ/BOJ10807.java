package BOJ;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 N개
        //N개 만큼의 정수
        //N에서 찾아야할 정수 v
        int A[] = new int[201];
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int index = sc.nextInt();
            A[index+100]++; //1입력시 A의 101자리에 ++
        }
        int v = sc.nextInt();
        System.out.println(A[v+100]);
    }
}
