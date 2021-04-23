/*
 * File: Driver.java
 * Zachary Muranaka
 * Solves a hypergeometric distribution
 */

public class Driver
{
    public static void main(String[] args)
    {
        // The next four statements use static methods from check.java to get valid input
        long popSize = check.validData("Population size: ");
        long popSuccesses = check.validData("Population successes: ");
        long sampleSize = check.validData("Sample size: ");
        long desiredSuccesses = check.validData("Desired successes: ");

        // Construct the Deck object and print the results
        Deck myDeck = new Deck(popSize, popSuccesses, sampleSize, desiredSuccesses);
        myDeck.print();
    }
}
