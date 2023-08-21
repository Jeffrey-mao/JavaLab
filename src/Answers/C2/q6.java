package Answers.C2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = input.nextInt();
        int divide1 = number / 10;
        int divide2 = number % 10;
        int divide3 = divide1 / 10;
        int divide4 = divide1 % 10;
        int total = divide2 + divide3 + divide4;
        System.out.println(total);
        input.close();
    }

}
