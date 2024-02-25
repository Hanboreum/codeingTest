package BOJ;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int std[] =new int[30]; //총학생
        for(int i=1;i<=28; i++){
            int num = sc.nextInt(); //28번 반복해 제출한 학생 접수
            std[num-1 ] =1;
            //std의 인덱스는 학생의 번호
            // 입력 받은 학생에서 -1을 해 배열의 인덱스로 사용
            // 해당 학생이 과제를 제출했으면 그 위치의 값을 1로 설정

        }
        for(int i=0; i<30; i++){
            if(std[i] ==0) //배열 순회, 값이 0인 인덱스를 찾아 학생 번호 출력
                //값이 0일이 과제 미제출
                System.out.println(i+1);
        }
    }
}
