package Answers.C1;

public class q7 {
    public static void main(String[] args) {
        double sum = 1.0;
        double s = 1.0;
        for(double i= 1.0;i < 6.0;i++) {

            sum += Math.pow(-1,i) * (1 / (i * 2 +1));
        }
        for(double i= 1.0;i < 7.0;i++) {
            s += Math.pow(-1,i) * (1 / (i * 2 +1));
        }
        System.out.println(sum * 4);
        System.out.println(s * 4);

    }

}


