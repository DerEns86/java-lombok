import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s1 = new Student("Student1", "Max Muster", "Musterstraße", 3);
        Student s2 = new Student("Student2", "Harald", "Musterweg", 6);
        List<Student> students = new ArrayList<>(List.of(s1, s2));


        Teacher t1 = new Teacher("Teacher1", "Rainer", "Deutsch");

        Course course1 = new Course("Course1", "Deutsch" , t1 , students);

        System.out.println("Kurs1: " +course1);

        Student s3 = Student.builder()
                .id("Student3")
                .name("Test3")
                .address("Test3")
                .grade(1)
                .build();

//        students.add(s3);

        Course course2 = Course.builder()
                .id("Course2")
                .name("Mathe")
                .teacher(new Teacher("Teacher2", "Maria", "Mathe"))
                .students(students)
                .build();

        System.out.println("Kurs2: " +course2);

        Course course3 = course2.withStudents(new ArrayList<>(List.of(s1,s2,s3)));

        System.out.println(("Kurs 3: " + course3));

    }
}