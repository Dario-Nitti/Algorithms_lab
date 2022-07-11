package List;

import java.util.ArrayList;
import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        new ListEx().run();
    }

    private void run() {
        Student s1 = new Student("Jones", 3.1),
                s2 = new Student("Smith", 4.5),
                s3 = new Student("Dario", 5.5),
                s4 = new Student("Marco", 2.1);
        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        System.out.println(list);

    }
}


