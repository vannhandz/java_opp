package khoangcach;

import java.util.Scanner;

public class KhoangCach {
    double x;
    double y;

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
