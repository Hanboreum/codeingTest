package BOJ;

import java.util.Scanner;

public class BOJ25640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jinho = sc.nextLine();
        int f = sc.nextInt();
        sc.nextLine();
        String[] fType = new String[f];

        int total = 0;
        for(int i=0; i< f; i++){
            fType[i] = sc.nextLine();

            if(jinho.equals(fType[i])){
                 total++ ;
            }
        }
        sc.close();
        System.out.println(total);
    }
}
