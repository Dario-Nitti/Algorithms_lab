package List;

import java.util.Objects;

public class Student implements Comparable<Student>{

    String name;
    double media_voti;



    public Student(){}

        public Student(String name, double media_voti) {
            this.name = name;
            this.media_voti = media_voti;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.media_voti, media_voti) == 0 && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", media_voti=" + media_voti +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        final double DELTA = 0.0000001;
        if(name.compareTo(o.name)<0) return  -1;
        if(name.compareTo(o.name)>0) return 1;
        if(media_voti - o.media_voti> DELTA) return -1;
        if(media_voti - o.media_voti > DELTA) return 1;
        return 0;
    }
}
