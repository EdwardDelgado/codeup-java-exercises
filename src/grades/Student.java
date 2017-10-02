package grades;

import java.util.ArrayList;

//Constructor
public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//    Methods
    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(Integer grade : grades) {
            total += grade;
        }
        return total /grades.size();
    }

    public static void main(String[] args) {
        Student student = new Student("Edward");
        student.addGrade(80);
        student.addGrade(95);
        student.addGrade(85);
        student.addGrade(70);
        System.out.println(student.getName() + "'s grade average is: " + student.getGradeAverage());
    }
}

