package Answers.C1;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用时分钟部分：");
        int minutes = input.nextInt();
        System.out.print("请输入用时秒钟部分：");
        int seconds = input.nextInt();
        System.out.print("请输入跑步距离：");
        double distance = input.nextDouble();
        System.out.println("他的平均速度：" +
                (distance / 1.6)/ ((minutes * 60) + seconds)/3600);
    }

    }

