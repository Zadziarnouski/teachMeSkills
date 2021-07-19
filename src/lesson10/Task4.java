package lesson10;

import java.io.File;
import java.util.Arrays;

/*
Задание 36
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
*/
public class Task4 {
    public static void main(String[] args) {
        File directory = new File("/home/taras/Programming/IdeaProjects/TeachMeSkills/src/");
        System.out.println(directory.isDirectory());
        System.out.println(Arrays.asList(directory.list()));
        for (File file : directory.listFiles()) {
            File[] files = file.listFiles();
                for(File files2 : files){
                    System.out.print(files2.getName()+ " ");
                }
        }
    }


}

