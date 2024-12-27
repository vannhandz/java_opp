package constructor.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student= new Student("Nhan",123,11);
        student.outPut();
        student.setScore(12);

    }
}
