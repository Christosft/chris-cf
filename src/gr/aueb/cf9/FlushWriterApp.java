package gr.aueb.cf9;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FlushWriterApp {

    public static void main(String[] args ) {

        try (PrintWriter pw = new PrintWriter("c:/tmp/flushWriter.txt", StandardCharsets.UTF_8)){
            Scanner in = new Scanner(System.in);
            System.out.println("Please write something");
            in.nextInt();
            pw.println("in.nextInt()");
            pw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
