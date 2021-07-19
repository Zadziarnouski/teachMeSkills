package lesson8.task1_stack;

/*Задание 28
Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
*/
public class Runner {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        stack1.put("Shalom");
        System.out.println(stack1.get(0));

        Stack<Integer> stack2 = new Stack<>();
        stack2.put(10);
        stack2.put(35);
        stack2.put(11);
        System.out.println(stack2.get(0) + stack2.get(2));
    }
}
