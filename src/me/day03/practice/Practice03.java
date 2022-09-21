package me.day03.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        int num1, num2;
        String mathOperator;


        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요");
        num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        num2 = scanner.nextInt();

        System.out.println("연산자를 입력해주세요");
        mathOperator = scanner.next();

        if(mathOperator.equals("+") ) {
            System.out.println(num1+num2);
        }
        else if(mathOperator.equals("-")) {
            System.out.println(num1-num2);
        }
        else if(mathOperator.equals("*")) {
            System.out.println(num1*num2);
        }
        else if(mathOperator.equals("/")) {
            System.out.println(num1/num2);
        }
        else if(mathOperator.equals("%")) {
            System.out.println(num1%num2);
        }
        else {
            System.out.println("연산자가 유효하지 않습니다");
        }

    }
}
