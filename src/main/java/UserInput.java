import java.util.Scanner;

public class UserInput {

    public void userInput() {

        Validations validations = new Validations();

        boolean containsWhitespace = false;
        boolean isNumber = false;
        boolean underThreeDigits = false;
        Scanner scanner = new Scanner(System.in);

        while (!(containsWhitespace && isNumber && underThreeDigits)) {

            System.out.println("Please enter a telephone number, with numbers separated by space and each number up to 3 digits.");
            String input = scanner.nextLine();

            containsWhitespace=input.contains(" ");
            isNumber = input.matches("\\d+");
            String inputToCheck = input.replace(" ","");

            String[] array = input.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].length()<=3) {
                    underThreeDigits = true;
                    if (validations.isTelephoneValid(inputToCheck)) {
                        System.out.println("Telephone: " + inputToCheck + " is " + "[VALID]");
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
