package me.day03.practice;
import java.util.Scanner;



public class Practice01 {
    public static void main(String[] args) {
        int korean;
        int math;
        int english;
        int sum;
        float average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("국어 성적을 입력해주세요: ");
        korean = scanner.nextInt();
        if(korean < 0 || korean > 100) {
            System.out.println("성적이 유효하지 않습니다");
            System.exit(0);
        }


        System.out.println("수학 성적을 입력해주세요: ");
        math = scanner.nextInt();
        if(math < 0 || math > 100 ) {
            System.out.println("성적이 유효하지 않습니다");
            System.exit(0);
        }


        System.out.println("영어 성적을 입력해주세요: ");
        english  = scanner.nextInt();
        if(english < 0 || english > 100 ) {
            System.out.println("성적이 유효하지 않습니다");
            System.exit(0);
        }

        average = (korean+math+english)/3.0f;

        if(average > 70) System.out.println("합격");
    }
}
