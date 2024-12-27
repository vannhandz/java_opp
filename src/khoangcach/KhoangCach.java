package khoangcach;

import java.util.Scanner;

public class KhoangCach {
    private double x;
    private double y;
    public KhoangCach() {}

    public KhoangCach(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public double getY() {return y;}

    public void setY(double y) {this.y = y;}



    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem x");
        x = sc.nextDouble();
        System.out.println("nhap diem y");
        y = sc.nextDouble();
    }

    public double tinh(KhoangCach kc)
    {
        return Math.sqrt((Math.pow(kc.x-x, 2) + Math.pow(kc.y-y, 2)));
    }
}
