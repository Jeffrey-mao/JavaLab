package Answers.C1;

public class q4 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i < 5; i++) {
            System.out.print((int) Math.pow(i, 1));//print不会换行
            System.out.print("\t");//一个制表符即4个空格
            System.out.print((int)Math.pow(i,2));
            System.out.print("\t");//一个制表符即4个空格
            System.out.println((int)Math.pow(i,3));//println自动换行
        }
    }
}
