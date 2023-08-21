package Answers.C2;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 points of an triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double line12=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        double line13 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
        double line23 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double s = (line12 + line13 + line23) / 2;
        double area = Math.pow(s * (s - line12) * (s - line23) * (s - line13), 0.5);
        System.out.print("The area of this triangle is " + area);
        input.close();

    }
}
