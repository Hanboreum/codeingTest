package BOJ;

import java.util.Scanner;

public class BOJ2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt=0;
        for(int i=0;i< str.length(); i++){
            cnt++;
        }
        System.out.println(cnt);
    }
}
