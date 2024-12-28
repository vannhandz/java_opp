package kethua.sv;

import java.util.Scanner;

public class Person {
    private String name;
    private int id;

    public Person() {}

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap id: ");
        id=Integer.parseInt(input.nextLine());
        System.out.print("nhap ten: ");
        name=input.nextLine();
    }
    public void out()
    {
        System.out.println("id: "+id);
        System.out.println("ten: "+name);
    }

}
