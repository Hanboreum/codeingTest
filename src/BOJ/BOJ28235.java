package BOJ;

import java.util.Scanner;

public class BOJ28235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals("SONGDO")){
            System.out.println("HIGHSCHOOL");
        }else if(str.equals("CODE")){
            System.out.println("MASTER");
        }else if(str.equals("2023")){
            System.out.println("0611");
        } else if (str.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }

    }
}
