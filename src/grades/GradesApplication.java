package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    private final Map<String, Student> students;
    private final Input input;

    public GradesApplication(Map<String, Student> students, Input input) {
        this.students = students;
        this.input = input;
    }

    // Starts App
    public void init() {
        System.out.println("Welcome!");
        runInteraction();
    }

    // Abstracts the Part that Repeats
    private void runInteraction() {
        System.out.println(getStudentsList());
        System.out.println("\nWhat student would you like to see more information on?");
        String response = input.getString();
        if (students.containsKey(response)) {
            System.out.println(getStudentInfo(response));
        } else {
            System.out.println("\nSorry, no student found with the GitHub username of " + response);
        }
        System.out.println("\nWould you like to enter a new response? [y/n]");
        boolean willContinue = input.yesNo();
        if (willContinue) {
            runInteraction();
        } else {
            System.out.println("\nGoodbye!");
        }
    }

    // Returns a message containing a list of students
    private String getStudentsList() {
        StringBuilder output = new StringBuilder("Here are the user names of our students:\n\n");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            output.append("|").append(entry.getKey()).append("| ");
        }
        return "\n" + output.toString().trim();
    }

    // Returns a formatted message containing student information
    private String getStudentInfo(String username) {
        return String.format(
                "%nName: %s - GitHub Username: %s%nCurrent Average: %.2f",
                students.get(username).getName(),
                username,
                students.get(username).getGradeAverage());
    }

    // Used to populate the HashMap of students
    private static HashMap<String, Student> createStudents() {

        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Pon");
        s1.addGrade(0);
        s1.addGrade(50);
        s1.addGrade(100);

        Student s2 = new Student("Jon");
        s2.addGrade(80);
        s2.addGrade(90);
        s2.addGrade(70);

        Student s3 = new Student("Bob");
        s3.addGrade(80);
        s3.addGrade(90);
        s3.addGrade(100);

        students.put("qwert", s1);
        students.put("asdfg", s2);
        students.put("zxcvb", s3);

        return students;

    }

    public static void main(String[] args) {
        GradesApplication ga = new GradesApplication(createStudents(), new Input());
        ga.init();
    }


}