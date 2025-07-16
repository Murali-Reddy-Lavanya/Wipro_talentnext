package iostreams;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get file name from user
        System.out.println("Enter the file name");
        String fileName = input.nextLine();

        // Get character to be counted
        System.out.println("Enter the character to be counted");
        char targetChar = input.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                for (char c : line.toCharArray()) {
                    if (c == targetChar) {
                        count++;
                    }
                }
            }

            System.out.printf("File '%s' has %d instances of letter '%c'.\n", fileName, count, targetChar);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found.");
        }

        input.close();
    }
}

