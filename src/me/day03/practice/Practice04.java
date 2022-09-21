package me.day03.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("X값을 입력해주세요");
        x = scanner.nextInt();

        System.out.println("Y값을 입력해주세요");
        y = scanner.nextInt();

        if(x > 0 && y > 0) {
            System.out.println("1 사분면");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2 사분면");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3 사분면");
        }
        else if (x > 0 && y < 0) {
            System.out.println("4 사분면");
        }
        else if (y == 0 & x != 0) {
            System.out.println("x 축 위에 있음");
        }
        else if (x == 0 & y != 0) {
            System.out.println("y 축 위에 있음");
        }
    }
}
