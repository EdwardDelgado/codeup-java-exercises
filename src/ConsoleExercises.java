import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String [] args) {
    Scanner input; //null
    input = new Scanner(System.in); //in JS constructor function, in Java constructor

    //var stringValue = prompt("");
    System.out.println("Enter an integer value");
    int number = input.nextInt(); //You'll get an inputMismatchException if you don't provide an integer.
    System.out.println(number);

    System.out.println("Enter 3 words");
    String wordOne = input.next();
    String wordTwo = input.next();
    String wordThree = input.next();

    input.nextLine(); //This is the extra \n (enter)

    System.out.println("Enter a sentence");
    String sentence = input.nextLine();
    System.out.println(sentence);

//    wrapper classes
//        int -> Integer, float -> Float, double -> Double, long -> Long
//        input

    System.out.println("Enter the width of the classroom");
    int width = input.nextInt();
    System.out.println("Enter the length of the classroom");
    int length = input.nextInt();
    int area = length * width;
    int perimeter = 2 * length + 2 * width;

    System.out.println("The area of the classroom is " + area);
    System.out.println("The area of the perimeter is " + perimeter);

    }
}
