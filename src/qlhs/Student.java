package qlhs;

import java.util.Scanner;

public class Student {
    private String name;
    private double toan;
    private double van;

    public Student() {}

    public Student(String name, double toan, double van) {
        this.name = name;
        this.toan = toan;
        this.van = van;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getToan() {return toan;}

    public void setToan(double toan) {this.toan = toan;}

    public double getVan() {return van;}

    public void setVan(double van) {this.van = van;}

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
