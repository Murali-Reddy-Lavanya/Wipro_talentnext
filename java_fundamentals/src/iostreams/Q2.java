package iostreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get file names from user
        System.out.println("Enter the input file name");
        String sourceFile = input.nextLine();

        System.out.println("Enter the output file name");
        String destFile = input.nextLine();

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile)
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
