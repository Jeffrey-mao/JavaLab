package Answers.C1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入矩形长");
        double longth = input.nextDouble();
        System.out.println("请输入矩形宽");
        double width = input.nextDouble();
        System.out.println("长" + longth + "宽" + width + "的矩形的面积是"
                + longth * width);
        System.out.println("长" + longth + "宽" + width + "的矩形的周长是"
                + (longth + width) * 2);
    }


}
