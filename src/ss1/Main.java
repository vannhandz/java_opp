package ss1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Student student2 = new Student(1,"nhan",4);
        student2.display();
        student2.setName("bao");
        System.out.println(student2.getName());


    }
}
