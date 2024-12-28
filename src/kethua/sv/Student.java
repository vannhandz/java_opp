package kethua.sv;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {}

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int id, double score) {
        super(name, id);
        this.score = score;
    }


    public void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap id: ");
        super.setId(Integer.parseInt(input.nextLine()));
        System.out.print("nhap ten: ");
        super.setName(input.nextLine());
        System.out.print("nhap score: ");
        score = Double.parseDouble(input.nextLine());
    }
    public void out()
    {
        System.out.println("id: "+super.getId());
        System.out.println("ten: "+super.getName());
        System.out.println("score: "+score);
    }

}
