package Answers.C1;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius = input.nextDouble();
        System.out.println("半径为" + radius +  "的圆的面积是" +
                radius * radius * 3.14);
        System.out.println("半径为" + radius +  "的圆的周长是" +
                2 * radius * Math.PI);//Math.PI是3.14

    }
}
