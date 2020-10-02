package org.example.jdbcconnector;

import org.example.jdbcconnector.model.Author;
import org.example.jdbcconnector.model.Book;
import org.example.jdbcconnector.model.Genre;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver did not load!");
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&&serverTimezone=UTC&characterEncoding=UTF-8", "taras", "03081994@Taras")) {

            /***************************Authors****************************/
            List<Author> authors = new ArrayList<>();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from author");
            while (resultSet.next()) {
                int id = resultSet.getInt("idauthor");
                String name = resultSet.getString("author");
                Author author = new Author();
                author.setId(id);
                author.setName(name);
                authors.add(author);
            }

            /***************************Genre****************************/
            List<Genre> genres = new ArrayList<>();
            ResultSet resultSet2 = statement.executeQuery("SELECT * from genre");
            while (resultSet2.next()) {
                int id = resultSet2.getInt("idgenre");
                String name = resultSet2.getString("genre");
                Genre genre = new Genre();
                genre.setId(id);
                genre.setName(name);
                genres.add(genre);
            }

            /***************************Book****************************/
            List<Book> books = new ArrayList<>();
            ResultSet resultSet3 = statement.executeQuery("SELECT * from book");
            while (resultSet3.next()) {
                Book book = new Book();
                int id = resultSet3.getInt("id");
                int idbook = resultSet3.getInt("idbook");
                String title = resultSet3.getString("title");
                int authorId = resultSet3.getInt("author");
                int genreId = resultSet3.getInt("genre");
                int year = resultSet3.getInt("year");


                statement = con.createStatement();
                ResultSet resultSet4 = statement.executeQuery("select * from author where idauthor = " + authorId);
                while (resultSet4.next()) {
                    String author = resultSet4.getString("author");
                    book.setAuthor(author);
                }


                statement = con.createStatement();
                ResultSet resultSet5 = statement.executeQuery("select * from genre where idgenre =" + genreId);
                while (resultSet5.next()) {
                    String genre = resultSet5.getString("genre");
                    book.setGenre(genre);
                }


                book.setId(id);
                book.setIdBook(idbook);
                book.setTittle(title);
                book.setYear(year);
                books.add(book);
            }
            System.out.println(books);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
