package lesson15.applicationLib;

import Lesson7.robot.hands.TohibaHand;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    List<Book> lib = new ArrayList<>();
    HashMap<String, List> personalLibraryS = new HashMap<>();

    public void showHomeBook() {
        int a = 1;
        for (int i = 0; i < lib.size(); i++) {

            if (lib.get(i).takeAway) {
                System.out.println(a + ". " + lib.get(i));
                a++;
            }
        }
    }

    public void showLibraryBook() {
        int a = 1;
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).readingRoom)
                System.out.println(a + ". " + lib.get(i));
            a++;
        }
    }

    public void showPersonalLibrary(String name) {
        if (personalLibraryS.get(name).size() == 0) {
            System.out.println("Your list is empty.");
        } else {
            for (int i = 0; i < personalLibraryS.get(name).size(); i++) {
                Book b;
                b = (Book) personalLibraryS.get(name).get(i);
                System.out.println(b);
            }
        }
    }

    public synchronized void getBook(String name, int id) {
        for (int i = 0; i < lib.size(); i++) {
            if (id == lib.get(i).getId()) {
                personalLibraryS.get(name).add(lib.get(i));
                lib.remove(lib.get(i));
                System.out.println("book added.");
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void returnBook(String name, int id) {
        for (int i = 0; i < personalLibraryS.get(name).size(); i++) {
            Book b;
            b = (Book) personalLibraryS.get(name).get(i);
            if (b.getId() == id) {
                personalLibraryS.get(name).remove(i);
                System.out.println("Book has been removed from your list.");
            }
        }
    }

    public void createAList(String name) {
        List<Book> books = new ArrayList<>();
        personalLibraryS.put(name, books);

    }
}
