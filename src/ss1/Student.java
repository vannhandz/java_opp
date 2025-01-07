package ss1;

import java.util.Scanner;

public class Student {
    private int id;
    String name;
    double score;
    static int dem=0;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(){
        dem++;
    }
    Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        dem++;
    }


    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("nhap name: ");
        name = sc.nextLine();
        System.out.print("nhap score: ");
        score = Double.parseDouble(sc.nextLine());
    }
    void display() {
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("score: "+score);
        System.out.println("dem: "+dem);
    }

}
