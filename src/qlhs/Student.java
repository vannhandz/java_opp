package qlhs;

import java.util.Scanner;

public class Student {
    String name;
    double toan;
    double van;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();

        System.out.print("Nhap diem toan: ");
        toan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem van: ");
        van = Double.parseDouble(sc.nextLine());
    }
    public void output()
    {
        System.out.println("=== thong tin ===");
        System.out.println("Name: " + name);
        System.out.println("Diem trung binh: " + gpa());
    }
    public double gpa( )
    {
        return (toan + van) / 2;
    }

}
