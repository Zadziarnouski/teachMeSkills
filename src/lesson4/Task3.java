/*
 * Задание 20
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */

package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String str = "Та самая строка, над которой; я буду : эксперементировать.";
        Pattern regexp = Pattern.compile("[ :punct:]");
        Matcher m = regexp.matcher(str);
        while (m.find()) {
            System.out.print(str.charAt(m.start() - 1));
        }
    }
}
