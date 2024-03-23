package BOJ;

import java.util.Scanner;

//300 만렙 =1
//275 구만렙 = 2
//250 뀨만렙 =3
//250 미만. 뀨만렙 미만 =4
public class BOJ28453 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i< n; i++){
            int m = sc.nextInt();
           if( m >= 300){
               System.out.print("1 ");
           }else if( m >= 275 && m < 300){
               System.out.print("2 ");
           }else if( m >=250 && m <275){
               System.out.print("3 ");
           }else if( m <250){
               System.out.print("4 ");
           }
        }
        sc.close();
    }
}

