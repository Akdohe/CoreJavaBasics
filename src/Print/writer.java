package Print;

import java.io.PrintWriter;

public class writer {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String st = "Project 2";
        pw.println("This is a " + st);
    }
}
