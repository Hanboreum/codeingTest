package BOJ;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] std = new int[31];

     for(int i=0; i<28; i++){
         int num = sc.nextInt();
         std[num] =1;
     }
     for(int i=1; i<30; i++){
         if(std[i]==0)
             System.out.println(i);
     }

    }
}