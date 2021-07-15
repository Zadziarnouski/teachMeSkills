package lesson8.task28;

/*Задание 28
Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
*/
public class Ruuner {
    public static void main(String[] args) {
        Stock<String> stock1 = new Stock<>();
        stock1.put("Shalom");
        System.out.println(stock1.get(0));

        Stock<Integer> stock2 = new Stock<>();
        stock2.put(10);
        stock2.put(35);
        stock2.put(11);
        System.out.println(stock2.get(0) + stock2.get(2));
    }
}
