package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

//    public double getGradeAverage() {
//        double sum = 0;
//        for (int grade : grades) {
//            sum += grade;
//        }
//        return sum / grades.size();
//    }

    public double getGradeAverage() {
        return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
    }

    public static void main(String[] args) {

        Student student1 = new Student("bob");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);
        System.out.println(student1.getGradeAverage());

    }

}

