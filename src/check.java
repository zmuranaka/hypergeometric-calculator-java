/*
 * File: check.java
 * Zachary Muranaka
 * Contains a static method that the Driver uses to make sure the user enters a valid long
 */

import java.util.Scanner;

public class check
{
    static Scanner reader = new Scanner(System.in);

    public static long validData(final String prompt)
    {
        System.out.print(prompt);
        String userInput = reader.nextLine(); // Reads the user input as a String
        
        // Try to convert the user input to a long and return it
        try
        {
            long potentialData = Long.parseLong(userInput);
            return potentialData;
        }
        // Catches cases when the user's input could not be converted to a long
        catch (NumberFormatException nException)
        {
            System.out.println(prompt.substring(0, prompt.length() - 2) + " should be an integer. Try again.");
            return validData(prompt);
        }
    }
}
