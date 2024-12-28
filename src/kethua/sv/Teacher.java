package kethua.sv;

public class Teacher extends Person {
    private int salary;

    public Teacher() {}

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }
}
