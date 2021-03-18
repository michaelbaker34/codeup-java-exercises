package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {

        List<Integer> grades = Arrays.asList();
        Student student1 = new Student("bob", grades);
//        student1.addGrade(90);
//        student1.addGrade(90);
        System.out.println(student1.getGradeAverage());

    }

}

