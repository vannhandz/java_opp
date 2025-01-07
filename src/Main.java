import ss1.Student;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("DTC122".matches("DTC[0-9]{3}"));
        System.out.println("0326785629".matches("(0|[+]84)3[2-9][0-9]{7}"));
    }
}
