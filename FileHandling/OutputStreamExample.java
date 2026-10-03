package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamExample {
    public static void main(String[] args) {
        // (char) 10- give a new line

        // Write on console
//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello World");
//            osw.write(10);
//            osw.write(12);
//            osw.write("No More");
//            osw.write('A');
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // OverWrite in file
        // Use 'true' with file address for append
        try(FileWriter fl = new FileWriter("D:/Java (DSA)/src/FileHandling/msg.txt", true)) {
            fl.write(" The way to the world!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
