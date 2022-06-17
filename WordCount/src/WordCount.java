import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Pride and Prejudice.txt");
        Scanner scanner = new Scanner(file);
        int numOfWords = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            numOfWords += line.split(" ").length;
        }
        System.out.println("The file has " + numOfWords + " words");
    }
}
