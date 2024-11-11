package Tests;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Антон", "C23-101", 2, List.of(4, 5, 3)));
        students.add(new Student("Марк", "C23-103", 1, List.of(4, 4, 3)));
        students.add(new Student("Иван", "C23-104", 1, List.of(2, 3, 3)));
        students.add(new Student("Глеб", "C23-102", 3, List.of(3, 3, 3)));
        students.add(new Student("Данил", "C23-101", 2, List.of(2, 5, 2)));
        students.add(new Student("Илья", "C23-103", 3, List.of(2, 4, 4)));


        System.out.println("Студенты до обработки");
        for (Student student: students){
            System.out.println(student.toString());
        }
        System.out.println();

        Student.studentManagment(students);

        System.out.println("Студенты после обработки");
        for (Student student: students){
            System.out.println(student.toString());
        }
        System.out.println();

        System.out.println("Студенты, обучающиеся на 3 курсе");
        Student.printStudents(students, 3);
    }
}
