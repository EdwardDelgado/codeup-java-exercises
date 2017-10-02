package grades;
import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public Student(){};
    // returns student's name
    public String getName(){
        return this.name;
    }
    // adds grades to the grades property
    public void addGrade(int grades){
        this.grades.add(grades);
    }
    // returns students average
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade: grades) {
            sum += grade;
        }
        return sum /grades.size();
    }
    public static void main(String[] args) {
        Student student = new Student("Micky");
        student.addGrade(85);
        student.addGrade(99);
        student.addGrade(85);
        student.addGrade(50);
        System.out.println(student.getName() + "'s grade average is: " + student.getGradeAverage());
    }
}

