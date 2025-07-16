package iostreams;

import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input and output file names from user
        System.out.println("Enter the input file name");
        String inputFile = scanner.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = scanner.nextLine();

        Map<String, Integer> wordCountMap = new TreeMap<>();  // TreeMap to store words in sorted order

        // Read input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    word = word.trim();
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Write to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Word counts written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }

        scanner.close();
    }
}

