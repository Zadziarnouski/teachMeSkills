package lesson10.additional_tasks.task2;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        String s = null;
        try (BufferedReader br = new BufferedReader(new FileReader("TextFormater.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("TextFormater2.txt"))) {

            while ((s = br.readLine()) != null) {
                if (TextFormater.isPolindromsInLine(s)) {
                    bw.write(s + "\n");
                } else if (TextFormater.numberOfWordsInLine(s) >= 3 && TextFormater.numberOfWordsInLine(s) <= 5) {
                    bw.write(s + "\n");
                } else {
                }
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}