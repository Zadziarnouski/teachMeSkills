package Lesson12.additionalTasks;

import java.io.*;

/*
1)В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы.
*/
public class Task1 {
    public static void main(String[] args) {
        String s = null;
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(new File("wordsNew.txt")))) {
            while ((s = br.readLine()) != null) {
                StringBuffer sb = new StringBuffer(s);
                if (s.equals(sb.reverse().toString())) {
                    bw.write(s + "\n");
                }
            }
        } catch (
                IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
