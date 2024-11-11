package Tests;

import java.util.Iterator;
import java.util.List;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double averageGrade(){
        int sum = 0;
        for(int grade: grades){
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public String gradesToString(List<Integer> grades){
        StringBuilder str = new StringBuilder();
        for (int grade: grades){
            str.append(grade).append(" ");
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return "Студент: " + "\n" +
                "   имя: " + name + "\n" +
                "   группа: " + group + "\n" +
                "   курс: " + course + "\n" +
                "   оценки: " + gradesToString(grades);
    }

    public static void studentManagment(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageGrade() >= 3.0) {
                student.course++;
            } else {
                iterator.remove();
            }
        }
    }


    public static void printStudents(List<Student> students, int course){
        for (Student student: students){
            if (student.course == course){
                System.out.println(student.getName());
            }
        }
    }
}