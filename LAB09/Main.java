import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Марія", 1));
        students.add(new Student("Олександр", 1));
        students.add(new Student("Микола", 2));
        students.add(new Student("Ростислав", 3));
        students.add(new Student("Віталій", 2));

        System.out.println("Студенти 1-го курсу:");
        Student.printStudents(students, 1);

        System.out.println("Студенти 2-го курсу:");
        Student.printStudents(students, 2);

        System.out.println("Студенти 3-го курсу:");
        Student.printStudents(students, 3);
    }
}
