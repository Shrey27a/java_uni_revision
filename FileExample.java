import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Creating a File object with a file name
            File myFile = new File("example.txt");

            // Check if file already exists
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            // Handle exception if file cannot be created
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}

