
import java.util.Scanner;

public class BOJ31428 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 친구수
        String[] f = new String[N];

        for (int i=0; i<f.length; i++){
            f[i] =sc.next();
        }
        String h = sc.next();
        int count =0;
        for(int i=0; i<f.length; i++){
            if(f[i].equals(h)){
                count ++ ;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
