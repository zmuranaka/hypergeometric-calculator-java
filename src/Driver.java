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
        long popSize = check.validPopSize();
        long popSuccesses = check.validPopSuccesses();
        long sampleSize = check.validSampleSize();
        long desiredSuccesses = check.validDesiredSucccesses();

        Deck orGreaterDeck = new Deck(popSize, popSuccesses, sampleSize, desiredSuccesses); // Constructs a Deck object
        Deck orLessDeck = new Deck(orGreaterDeck); // Constructs a copy of the above Deck
        
        // The next next six statements calculate probabilities for the Decks
        double orGreaterExactChance = orGreaterDeck.probability(orGreaterDeck.getdpopSize(), orGreaterDeck.getdpopSuccesses(), orGreaterDeck.getddesiredSuccesses(), orGreaterDeck.getdpopFailures(), orGreaterDeck.getdsampleFailures());
        double orLessExactChance = orLessDeck.probability(orLessDeck.getdpopSize(), orLessDeck.getdpopSuccesses(), orLessDeck.getddesiredSuccesses(), orLessDeck.getdpopFailures(), orLessDeck.getdsampleFailures());
        orGreaterExactChance *= orGreaterDeck.getcombination(); // Chance of getting exactly desired successes
        double orGreaterInclusiveChance = orGreaterDeck.orGreater(orGreaterExactChance); // Chance of getting desired successes or greater
        orLessExactChance *= orLessDeck.getcombination(); // Chance of getting exactly desired successes
        double orLessInclusiveChance = orLessDeck.orLess(orLessExactChance); // Chance of getting desired successes or less
        
        // The next five statements print out the probabilities
        System.out.println("Chance of exactly desired successes: " + orGreaterExactChance); // orGreaterExactChance and orLessExactChance should be equal so this could also be orLessExactChance
        System.out.println("Chance of less than desired successes: " + (orLessInclusiveChance - orLessExactChance));
        System.out.println("Chance of desired successes or less: " + orLessInclusiveChance);
        System.out.println("Chance of greater than desired successes: " + (orGreaterInclusiveChance - orGreaterExactChance));
        System.out.println("Chance of desired successes or greater: " + orGreaterInclusiveChance);
    }

}
