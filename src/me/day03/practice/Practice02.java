package me.day03.practice;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {
        String input = "";
        String output = "";
        int tmp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("문자를 입력해주세요");


        input = scanner.nextLine();

        for(int i=0; i<input.length(); i++) {
            tmp = (int)input.charAt(i);

            if( (65 <= tmp) && (tmp <= 90)) {
                output += (char)(tmp+32);
            }
            else if((97 <= tmp) && (tmp <= 122)) {
                output += (char)(tmp-32);
            }
            else {
                System.out.println("영문자가 유효하지 않습니다");
                System.exit(0);
            }
        }

        System.out.println(output);

    }

}
