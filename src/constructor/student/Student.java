package constructor.student;

public class Student {
    private String name;
    private int id;
    private double score;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getScore() {
        return score;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("ten khong duoc de trong");
        } else {
            this.name = name;
        }

    }
    public void setScore(double score) {
        if(score>=0&&score <=10)
        {
            this.score = score;
        }else
        {
            System.out.println("diem trong khoang 0-10");
        }
    }

    public Student(String name, int id, double score) {
        this.id=id;
        setName(name);
        setScore(score);
    }

    public void outPut() {
        System.out.println("Name: "+name+"\nId: "+id+"\nScore: "+score);
    }

}
