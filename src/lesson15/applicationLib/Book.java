package lesson15.applicationLib;

import java.util.Objects;

class Book {
    private String title;
    private String author;
    private String genre;
    private int year;
    private int id;
    private String coverType;
    boolean takeAway;
    boolean readingRoom;

    public Book(String title, String author, String genre, int year, int id, String coverType, boolean takeAway, boolean readingRoom) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.id = id;
        this.coverType = coverType;
        this.takeAway = takeAway;
        this.readingRoom = readingRoom;

    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public boolean isReadingRoom() {
        return readingRoom;
    }

    public void setReadingRoom(boolean readingRoom) {
        this.readingRoom = readingRoom;
    }

    @Override
    public String toString() {
        return  '\"' +title + '\"' +
                ", author:" + author +
                ", genre:" + genre +
                ", year:" + year +
                ", id:" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year &&
                id == book.id &&
                takeAway == book.takeAway &&
                readingRoom == book.readingRoom &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(coverType, book.coverType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, year, id, coverType, takeAway, readingRoom);
    }
}
