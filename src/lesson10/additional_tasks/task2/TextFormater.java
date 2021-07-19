package lesson10.additional_tasks.task2;

public class TextFormater {

    public static int numberOfWordsInLine(String s) {
        String[] arr = s.split(" ");
        return arr.length;
    }

    public static boolean isPolindromsInLine(String s) {
        String[] arr = s.split(" ");
        for (String string : arr) {
            if (string.length() == 1) {
                continue;
            }
            StringBuilder sb = new StringBuilder(string);
            if (string.equals(sb.reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
