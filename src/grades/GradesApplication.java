package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student michael = new Student("Michael");
        Student travis = new Student("Travis");
        Student carlo = new Student("Carlo");
        Student paul = new Student("Paul");

        System.out.println(michael.getName());
        System.out.println(travis.getName());
        System.out.println(carlo.getName());
        System.out.println(paul.getName());


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

        System.out.println(michael.getGradeAverage());
        System.out.println(travis.getGradeAverage());
        System.out.println(carlo.getGradeAverage());
        System.out.println(paul.getGradeAverage());

//        Add students to the map
        students.put("TrickyMicky", michael);
        students.put("T-Payne", travis);
        students.put("Carlito", carlo);
        students.put("Pablo", paul);


//        for(Student usernames : students.values()){
//            System.out.println(" | " + usernames + " : ");
//            System.out.println(students.get(usernames).getName());
//        }

        for (String key : students.keySet()){
            Student curStudent = students.get(key);
            System.out.println(("Name: " + curStudent.getName() + " - Github Username: " +key+"\n" +
                    "Current Average: " + curStudent.getGradeAverage() + "\n"));
        }
    }
}