package BOJ;

import java.util.Scanner;

public class BOJ25372 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a = sc.nextInt();

        for( int i=0; i < a; i++){
            String pw = sc.next();
            if( pw.length() >=6 && pw.length() <=9){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
