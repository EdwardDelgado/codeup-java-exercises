package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student michael = new Student("Michael");
        Student travis = new Student("Travis");
        Student carlo = new Student("Carlo");
        Student paul = new Student("Paul");

        michael.addGrade(95);
        michael.addGrade(99);
        michael.addGrade(90);
        michael.addGrade(100);

        travis.addGrade(100);
        travis.addGrade(99);
        travis.addGrade(100);
        travis.addGrade(99);


        carlo.addGrade(90);
        carlo.addGrade(85);
        carlo.addGrade(95);
        carlo.addGrade(91);


        paul.addGrade(90);
        paul.addGrade(80);
        paul.addGrade(85);
        paul.addGrade(95);

//        Add students to the map
        students.put("TrickyMicky", michael);
        students.put("T-Payne", travis);
        students.put("Carlito", carlo);
        students.put("Pablo", paul);

        while (true) {

            System.out.println("1.- View all info students");
            System.out.println("2.- View all names");
            System.out.println("3.- Which student:");
            System.out.println("4.- Exit");

            int option = input.getInt(1, 4);

            switch (option) {
                case 1:
                    printAll(students, "info");
                    break;
                case 2:
                    printAll(students, "names");
                    break;
                case 3:
                    // view names
                    System.out.println("Give me the username:");
                    printOne(students, input.getString());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

            System.out.println("Would you like to continue?");
            if (!input.yesNo()) {
                break;
            }
        }

    }

    public static void printAll(HashMap<String, Student> students, String option) {
        for (String key : students.keySet()) {

            Student curStudent = students.get(key);

            if (option.equals("info")) {
                System.out.println("Name: " + curStudent.getName() + " - Gihub Username: " + key + "\n" +
                        "Current Average: " + curStudent.getGradeAverage() + "\n");
            } else if (option.equals("names")) {
                System.out.print("|" + curStudent.getName() + "| ");
            }
        }
        System.out.println();
    }

    public static void printOne(HashMap<String, Student> students, String username) {
        Student one = students.get(username);

        System.out.println("Name: " + one.getName() + " - Gihub Username: " + username + "\n" +
                "Current Average: " + one.getGradeAverage() + "\n");
    }
}
