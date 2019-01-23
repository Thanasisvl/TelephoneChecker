import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    public void userInput() {

        Validations validations = new Validations();

        boolean containsWhitespace = false;
        boolean isNumber = false;
        boolean underThreeDigits = false;
        Scanner scanner = new Scanner(System.in);

        //Checks if the user's input contains whitespaces, is numeric characters and if each number is up to three digits
        while (!(containsWhitespace && isNumber && underThreeDigits)) {

            System.out.println("Please enter a telephone number, with numbers separated by space and each number up to 3 digits.");
            String input = scanner.nextLine();

            containsWhitespace=input.contains(" ");
            isNumber = input.matches("\\d+");
            String inputToCheck = input.replace(" ","");

            //convert user's input to String with no whitespaces
            String[] array = input.split(" ");
            //convert user's input to list
            List<String> userList = new ArrayList<String>(Arrays.asList(input.split(" ")));

            for (int i = 0; i < array.length; i++) {
                if (array[i].length()<=3) {
                    underThreeDigits = true;

                    //If all conditions are met, it is checked if the number is a valid Greek Number
                    if (validations.isTelephoneValid(inputToCheck)) {
                        System.out.println("Telephone: " + inputToCheck + " is " + "[VALID]");
                    }
                    else {
                        System.out.println("The number " + inputToCheck + " is [INVALID] - Not a Greek Number");
                    }
                }
                else {
                    underThreeDigits = false;
                    System.out.println("Telephone: " + inputToCheck + " is " + "[INVALID]");
                } break;
            }
        }
    }
}
