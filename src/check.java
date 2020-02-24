/*
 * File: check.java
 * Zachary Muranaka
 * Contains methods that the Driver uses to check if the user entered valid longs
 */

import java.util.Scanner;

public class check
{
    static Scanner input = new Scanner(System.in);

    public static long validPopSize()
    {
        System.out.print("Population size: ");
        String spopSize = input.nextLine(); // Reads the user input as a String
        long lpopSize = popSize(spopSize);
        if(lpopSize == -1)
            return validPopSize(); // The method will loop if the user entered an invalid long
        return lpopSize;
    }

   public static long validPopSuccesses()
   {
        System.out.print("Population successes: ");
        String spopSuccesses = input.nextLine(); // Reads the user input as a String
        long lpopSuccesses = popSuccesses(spopSuccesses);
        if(lpopSuccesses == -1)
            return validPopSuccesses(); // The method will loop if the user entered an invalid long
        return lpopSuccesses;
   }

   public static long validSampleSize()
   {
        System.out.print("Sample Size: ");
        String ssampleSize = input.nextLine(); // Reads the user input as a String
        long lsampleSize = sampleSize(ssampleSize);
        if(lsampleSize == -1)
            return validSampleSize(); // The method will loop if the user entered an invalid long
        return lsampleSize;
   }

   public static long validDesiredSucccesses()
   {
        System.out.print("Desired Successes: ");
        String sdesiredSuccesses = input.nextLine(); // Reads the user input as a String
        long ldesiredSuccesses = desiredSuccesses(sdesiredSuccesses);
        if(ldesiredSuccesses == -1)
            return validDesiredSucccesses(); // The method will loop if the user entered an invalid long
        return ldesiredSuccesses;
   }

    private static long popSize(String input)
    {
        // Tries to convert the String the user entered to a long
        try
        {
            long popSize = Long.parseLong(input);
            return popSize;
        }
        // The user entered something that is not a long
        catch(NumberFormatException nException)
        {
            System.out.println("Population size should be an integer. Try again.");
            return -1; // -1 indicates that there was an error
        }
    }

    private static long popSuccesses(String input)
    {
        // Tries to convert the String the user entered to a long
        try
        {
            long popSuccesses = Long.parseLong(input);
            return popSuccesses;
        }
        // The user entered something that is not a long
        catch(NumberFormatException nException)
        {
            System.out.println("Population successes should be an integer. Try again.");
            return -1; // -1 indicates that there was an error
        }
    }

    private static long sampleSize(String input)
    {
        // Tries to convert the String the user entered to a long
        try
        {
            long sampleSize = Long.parseLong(input);
            return sampleSize;
        }
        // The user entered something that is not a long
        catch(NumberFormatException nException)
        {
            System.out.println("Sample size should be an integer. Try again.");
            return -1; // -1 indicates that there was an error
        }
    }

    private static long desiredSuccesses(String input)
    {
        // Tries to convert the String the user entered to a long
        try
        {
            long desiredSuccesses = Long.parseLong(input);
            return desiredSuccesses;
        }
        // The user entered something that is not a long
        catch(NumberFormatException nException)
        {
            System.out.println("Desired Successes should be an integer. Try again.");
            return -1; // -1 indicates that there was an error
        }
    }
}
