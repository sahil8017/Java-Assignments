/*
Write a program to analyze the readability of a given text and determine the readability score based on the Flesch-Kincaid readability formula. Categorize the readability score into appropriate readability levels.
Problem Statement:
1. Write a Java program that accepts a string of text input from the user.
2. Calculate the total number of characters, words, sentences, and syllables in the text.
3. Use the Flesch-Kincaid readability formula to compute the readability score.
4. Categorize the readability score into one of the following categories:
4.1. 90-100: Very Easy
4.2. 80-89: Easy
4.3. 70-79: Fairly Easy
4.4. 60-69: Standard
4.5. 50-59: Fairly Difficult
4.6. 30-49: Difficult
4.7. 0-29: Very Confusing
*/
import java.util.Scanner;

class ReadabilityAnalyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a paragraph: ");
        String text = s.nextLine();
        s.close();

        int totalWords = text.split("\\s+").length;
        int totalSentences = text.split("[.!?]+").length;
        int totalSyllables = countSyllables(text);

        double readabilityScore = 206.835 - (1.015 * totalWords / totalSentences)
                - (84.6 * totalSyllables / totalWords);

        System.out.println("\nTotal Words: " + totalWords);
        System.out.println("Total Sentences: " + totalSentences);
        System.out.println("Total Syllables: " + totalSyllables);
        System.out.println("Readability Score: " + readabilityScore);
    }

    static int countSyllables(String text) {
        String[] words = text.split("\\s+");
        int totalSyllables = 0;
        for (String word : words) {
            totalSyllables += word.replaceAll("[^aeiouAEIOU]", "").length();
        }
        return totalSyllables;
    }
}
