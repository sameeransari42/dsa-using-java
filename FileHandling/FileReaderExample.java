package FileHandling;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
//        try (FileReader fr = new FileReader("D:/Java (DSA)/src/FileHandling/msg.txt")) {
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // Buffered Reader class
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("D:/Java (DSA)/src/FileHandling/msg.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}