package Answers.C2;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the years: ");
        int years = input.nextInt();
        System.out.println("第" + years + "年：" + 365 * years * (86400/7 - 86400/13 + 86400/45));
    }

}
