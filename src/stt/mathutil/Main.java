package stt.mathutil;

public class Main {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        int a=4;
        int b=5;
        double cong= MathUtil.cong(a,b);
        double tru=MathUtil.tru(a,b);
        double nhan=MathUtil.nhan(a,b);
        double chia=MathUtil.chia(a,b);
        System.out.println(cong);
        System.out.println(tru);
        System.out.println(nhan);
        System.out.println(chia);


    }
}
