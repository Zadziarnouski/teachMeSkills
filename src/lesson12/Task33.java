package lesson12;

/*Задание 33
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task33 {
    public static void main(String[] args){

        String str = new String("Мы урожая ждем от лучших лоз,\n" +
                "Чтоб красота жила, не увядая.\n" +
                "Пусть вянут лепестки созревших роз,\n" +
                "Хранит их память роза молодая.\n" +
                "А ты, в свою влюбленный красоту,\n" +
                "Все лучшие ей отдавая соки,\n" +
                "Обилье превращаешь в нищету, -\n" +
                "Свой злейший враг, бездушный и жестокий.\n" +
                "Ты - украшенье нынешнего дня,\n" +
                "Недолговременной весны глашатай, -\n" +
                "Грядущее в зачатке хороня,\n" +
                "Соединяешь скаредность с растратой.\n" +
                "Жалея мир, земле не предавай\n" +
                "Грядущих лет прекрасный урожай!");

        int wordCounter = 0;
        int punctCounter = 0;


        try(FileOutputStream fos = new FileOutputStream(new File("text.txt"));){
            fos.write(str.getBytes());
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }


        try(BufferedReader br = new BufferedReader( new FileReader("text.txt"))) {
            String string;
            while ((string = br.readLine()) != null){
                System.out.println(string);

                Pattern pattern = Pattern.compile(new String("[\\p{Punct}]"));
                Matcher matcher = pattern.matcher(string);
                while (matcher.find()){
                    punctCounter++;
                }

                String[] s = string.split("[ {Punct} ]");
                wordCounter += s.length;
            }
            } catch (IOException e2) {
            System.out.println(e2.getLocalizedMessage());
        }
        System.out.println("Колличество слов в тексте: " + wordCounter + ". Знаков припинания: " + punctCounter);
    }
}
