import java.util.*;
    public class Student{
        private String name;
        private int course;
        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }
        public String getName() {
            return name;
        }
        public int getCourse() {
            return course;
        }
        public static void printStudents(List<Student> students, int course){
            Iterator<Student> iterator = students.iterator();
            while(iterator.hasNext()){
                Student student = iterator.next();
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
