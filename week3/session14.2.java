import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(103, "Rahul"));
        list.add(new Student(101, "Amit"));
        list.add(new Student(102, "Priya"));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;
            }
        });

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
output:
101 Amit
102 Priya
103 Rahul
