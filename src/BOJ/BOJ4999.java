package BOJ;

import java.util.Scanner;

public class BOJ4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ah1 = sc.nextLine();
        String ah2 = sc.nextLine();

        if(ah1.length() >= ah2.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
