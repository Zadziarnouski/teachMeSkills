package Lesson12.additionalTasks.Task2;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        TextFormater tf = new TextFormater();
        String s = null;
        try (BufferedReader br = new BufferedReader(new FileReader("TextFormater.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("TextFormater2.txt"))) {

            while ((s = br.readLine()) != null) {
                if (tf.isPolindromsInLine(s)) {
                    bw.write(s + "\n");
                } else if (tf.numberOfwordsInLine(s) >= 3 && tf.numberOfwordsInLine(s) <= 5) {
                    bw.write(s + "\n");
                } else continue;
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}