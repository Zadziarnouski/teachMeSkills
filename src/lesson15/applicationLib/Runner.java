package lesson15.applicationLib;

import org.w3c.dom.ls.LSOutput;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library();    //Создаю библиотеку
        Book book = new Book();   //Создаю экземпляр книги
        Scanner sc = new Scanner(System.in); // ввод

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/taras/Documents/IdeaProjects/TeachMeSkills/src/lesson15/applicationLib/Library"));

            while (reader.hasNext()) {
                XMLEvent nextEvent = reader.nextEvent();
                if (nextEvent.isStartElement()) {
                    StartElement startElement = nextEvent.asStartElement();
                    switch (startElement.getName().getLocalPart()) {
                        case "book":
                            book = new Book();
                            break;
                        case "title":
                            nextEvent = reader.nextEvent();
                            book.setTitle(nextEvent.asCharacters().getData());
                            break;
                        case "author":
                            nextEvent = reader.nextEvent();
                            book.setAuthor(nextEvent.asCharacters().getData());
                            break;
                        case "genre":
                            nextEvent = reader.nextEvent();
                            book.setGenre(nextEvent.asCharacters().getData());
                            break;
                        case "year":
                            nextEvent = reader.nextEvent();
                            book.setYear(Integer.parseInt(nextEvent.asCharacters().getData()));
                            break;
                        case "id":
                            nextEvent = reader.nextEvent();
                            book.setId(Integer.parseInt(nextEvent.asCharacters().getData()));
                            break;
                        case "сoverType":
                            nextEvent = reader.nextEvent();
                            book.setCoverType(nextEvent.asCharacters().getData());
                            break;
                        case "takeAway":
                            nextEvent = reader.nextEvent();
                            book.setTakeAway(Boolean.parseBoolean(nextEvent.asCharacters().getData()));
                            break;
                        case "readingRoom":
                            nextEvent = reader.nextEvent();
                            book.setReadingRoom(Boolean.parseBoolean(nextEvent.asCharacters().getData()));
                            break;
                    }
                }
                if (nextEvent.isEndElement()) {
                    EndElement endElement = nextEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("book")) {
                        library.lib.add(book);
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {    //Достаю инфорацию из XML-файла в book, и затем кладу book в library. Таким образом у нас появляется библиотека с книгами.
            System.out.println(e.getLocalizedMessage());
        }

        boolean exit = false;
        while (!exit) {
            boolean exit1 = false;
            boolean exit2 = false;
            System.out.println("Welcome to the Library!");
            System.out.print("1.Enter your name.              0.Exit.\nYour action:");
            int choice = sc.nextInt();
            if (choice == 1) {
                exit1 = false;
                System.out.println("What's your name? ");
                System.out.print("Enter:");
                String name = sc.next();
                library.createAList(name);
                System.out.println("Hi, " + name + "!");
                while (!exit1) {
                    exit2 = false;
                    System.out.println("Menu:\n     1.Take a book(s) home.\n     2.Read in the library.\n     3.Give book(s).\n     4.Exit.\n");
                    System.out.print("Your action: ");
                    int action = sc.nextInt();
                    while (!exit2) {
                        if (action == 1) {
                            library.showHomeBook();
                            System.out.println("Enter id book(0 - if you want to come back.)");
                            boolean b = false;
                            while (!b) {
                                int idBook = sc.nextInt();
                                if (idBook == 0) {
                                    b = true;
                                    exit2 = true;
                                }
                                Thread thread = new Thread(() -> library.getBook(name, idBook));
                                thread.start();
                            }
                        } else if (action == 2) {
                            library.showLibraryBook();
                            boolean b2 = false;
                            while (!b2) {
                                int idBook = sc.nextInt();
                                if (idBook == 0) {
                                    b2 = true;
                                    exit2 = true;
                                }
                                Thread thread = new Thread(() -> library.getBook(name, idBook));
                                thread.start();
                            }
                        } else if (action == 3) {
                            library.showPersonalLibrary(name);
                            System.out.println("Enter id book(0 - if you want to come back.)");
                            boolean b3 = false;
                            while (!b3) {
                                int idBook = sc.nextInt();
                                if (idBook == 0) {
                                    b3 = true;
                                    exit2 = true;
                                }
                                Thread thread = new Thread(() -> library.returnBook(name, idBook));
                                thread.start();
                                try {
                                    thread.join();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                library.showPersonalLibrary(name);
                            }
                        } else if (action == 4) {
                            exit1 = true;
                            exit2 = true;
                        } else System.out.println("Try again.");
                    }
                }


            } else if (choice == 0) {
                System.out.println("Good Bye");
                exit = true;
            }
        }


//        boolean exitLibrary = false;
//        boolean exitMenu = false;
//        boolean exitMenu2 = false;
//
//        while (!exitLibrary) {
//            exitMenu = false;
//
//            while (!exitMenu) {
//                switch (sc.nextInt()) {
//                    case 1: {
//                        System.out.println("What's your name? ");
//                        System.out.print("Enter:");
//                        String name = sc.next();
//                        library.createAList(name);
//                        System.out.println("Hi, " + name + "!");
//                        System.out.println("Menu:\n     1.Take a book(s) home.\n     2.Read in the library.\n     3.Give book(s).\n     4.Exit.\n");
//                        System.out.print("Your action: ");
//                        int action = sc.nextInt();
//                        while (!exitMenu2) {
//                            switch (action) {
//                                case 1:
//                                    library.showHomeBook();
//                                    boolean b = false;
//                                    System.out.print("Enter id book(0 - if you want to exit): ");
//                                    while (!b) {
//
//                                        int idBook = sc.nextInt();
//                                        if (idBook == 0) {
//                                            b = true;
//                                            exitMenu2 = true;
//                                            System.out.println("exit");
//                                        }
//                                        Thread thread = new Thread(() -> library.getBook(name, idBook), name);
//                                        thread.start();
//                                    }
//
//                                    break;
//
//
//                                case 2:
//                                    library.showLibraryBook();
//                                    break;
//                                case 3:
//
//                                case 4:
//                                    exitMenu = true;
//                                    break;
//                                default:
//                                    System.out.println("Try again...");
//                                    break;
//
//                            }
//                        }
//                    }
//                    break;
//                    case 0:
//                        System.out.println("GoodBye!");
//                        exitLibrary = true;
//                        exitMenu = true;
//                        break;
//                    default:
//                        System.out.println("Try again!");
//                }
//            }
//        }
    }
}


