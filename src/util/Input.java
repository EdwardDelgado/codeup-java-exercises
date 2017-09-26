package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {


        scanner = new Scanner(System.in);
    }

    public String getString(){
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo(){
        System.out.print("y / n ?");
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(){
        if (this.scanner.hasNextInt()){
        return this.scanner.nextInt();
    } else {
            System.out.println("Invalid Input!");
            return getInt();

        }
}

    public int getInt(int min, int max) {
    int userInput = getInt();

    if (userInput < min || userInput > max){

    }

    }
}
