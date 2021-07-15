package lesson1;

public class Task3 {
    public static void main(String[] args) {
        int s = 4500;
        int sec = 4500 % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 7;
        int day = d % 7;
        int w = (d - day) / 7;
        //Answer A
        System.out.println(min + " минут " + sec + " секунд");
        //Answer B
        System.out.println(hour + " часов " + min + " минут " + sec + " секунд");
        //Answer C
        System.out.println(day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
        //Answer D
        System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
