package BOJ;

import java.util.Scanner;

public class BOJ30676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        if(620 <= star && star <=780){
            System.out.println("Red");
        }else if( 590 <= star && star < 620){
            System.out.println("Orange");
        }else if( 570 <=star && star < 590){
            System.out.println("Yellow");
        }else if(495 <= star && star < 570 ){
            System.out.println("Green");
        }else if(450 <= star && star < 495){
            System.out.println("Blue");
        }else if(425 <= star && star < 450){
            System.out.println("Indigo");
        } else if (380 <= star && star < 425) {
            System.out.println("Violet");
        }
        sc.close();
    }
}
