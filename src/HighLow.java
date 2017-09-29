import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random() * 100 + 1);
        System.out.println("Guess a number between 1 and 100.");
        while (true) {
            int userInput = scan.nextInt();
            scan.nextLine();
            if (userInput > random) {
                System.out.println("Lower");
            } else if (userInput < random) {
                System.out.println("Higher!");
            } else {
                System.out.println("You got it! The number was " + random);
                break;
            }
        }
    }
}

