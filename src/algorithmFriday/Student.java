package algorithmFriday;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {

    private long id;
    private String name;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("id: %d name: %s",getId(),getName());
    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(231, "Peter"));
        studentList.add(new Student(112,"John"));
        studentList.add(new Student(211, "Peter"));
        studentList.add(new Student(132,"John"));

        Optional<Student> value = studentList.stream()
                .filter(studentId -> studentId.getId() == 112)
                .findFirst();

        System.out.println(value);

    }
}
