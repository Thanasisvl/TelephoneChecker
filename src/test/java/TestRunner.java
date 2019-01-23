import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class TestRunner {

    public static void main(String[] args) {

        Result userInput = JUnitCore.runClasses(UserInputTest.class);

        for (Failure failure: userInput.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(userInput.wasSuccessful());


        Result validations = JUnitCore.runClasses(ValidationsTest.class);

        for (Failure failure: validations.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(validations.wasSuccessful());
    }

}