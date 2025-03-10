package co.gabrielli;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private String status;
    private String  genre;
    public Book(String title, String author, String status, String genre, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public String getTitle(){
        return title;
    }
    public int getIsbn(){
        return isbn;
    }
    public String getStatus(){
        return status;
    }
    //mudando status
    public void setStatus(String status){
        this.status = status;
    }
    public String getAuthor(){
        return author;
    }
}
