package Answers.C1;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入a的值：");
        double a = input.nextDouble();
        System.out.print("请输入b的值：");
        double b = input.nextDouble();
        System.out.print("请输入c的值：");
        double c = input.nextDouble();
        System.out.print("请输入d的值：");
        double d = input.nextDouble();
        System.out.print("请输入e的值：");
        double e = input.nextDouble();
        System.out.print("请输入f的值：");
        double f = input.nextDouble();
        if ((a * d - b * c) == 0) {
            System.out.println("该方程无解");
        } else {
            System.out.println((e * d - b * f) / (a * d - b * c));
            System.out.println((a * f - e * c) / (a * d - b * c));
        }
    }
}



