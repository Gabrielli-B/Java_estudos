package co.gabrielli;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Library {
    private String libraryName;
    private List<Book> books;
    private int isbnCounter = 1;
    private String accessCode = "myLibrary2040";


    //criando um Arraylist para o objeto Book
    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();

        insertBook("1984", "George Orwell", "Disponível", "Distopia");
        insertBook("O Senhor dos Anéis", "J.R.R. Tolkien", "Disponível", "Fantasia");
        insertBook("Dom Casmurro", "Machado de Assis", "Emprestado", "Romance");
        insertBook("A Revolução dos Bichos", "George Orwell", "Indisponível", "Fábula Política");
        insertBook("Drácula", "Bram Stoker", "Disponível", "Terror");
        insertBook("Sherlock Holmes: Um Estudo em Vermelho", "Arthur Conan Doyle", "Disponível", "Mistério");
        insertBook("Percy Jackson e o Ladrão de Raios", "Rick Riordan", "Emprestado", "Fantasia");
        insertBook("O Código Da Vinci", "Dan Brown", "Disponível", "Suspense");
        insertBook("A Metamorfose", "Franz Kafka", "Indisponível", "Ficção");
        insertBook("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Disponível", "Fantasia");
    }

    //retornando a lista de livros na biblioteca
    public List<Book> getBooks(){
        return books;
    }
    //inserindo na lista
    public void insertBook(String title, String author,String status,String genre){
        Book book = new Book(title,author,status,genre,isbnCounter++);
        books.add(book);
    }
    //removendo da lista
    public void removeBook(int isbn) {
        Iterator<Book> iterator = books.iterator();  // Criando um iterador para percorrer a lista
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn() == isbn) {
                iterator.remove();
                System.out.println("ISBN: " + book.getIsbn() + " | Título: " + book.getTitle() + " | Autor: " + book.getAuthor() + " foi removido com sucesso!");
                return;
            }
        }
        System.out.println("O livro com ISBN " + isbn + " não foi encontrado!");
    }

    public void genreBooks(String genre){
        boolean found = false;
        for(Book book : books){
            if(book.getGenre().equalsIgnoreCase(genre)){
                System.out.println("ISBN: " + book.getIsbn() + " | Título: " + book.getTitle() +
                        " | Autor: " + book.getAuthor() + " | Gênero: " + book.getGenre());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Não possuímos esse gênero na biblioteca!");
        }
    }
    //livros disponíveis
    public void availableBooks(){
        System.out.println("Livros disponíveis:");
        for(Book book : books){
            if(book.getStatus().equalsIgnoreCase("Disponivel") || book.getStatus().equalsIgnoreCase("Disponível")) {
                System.out.println("ISBN: " + book.getIsbn() + " | Título: " + book.getTitle() + " | Autor: " + book.getAuthor() + " | Gênero " + book.getGenre());
            }
        }
    }
    public void unavailableBook(){
        System.out.println("Livros indisponíveis:");
        for(Book book : books){
            if(book.getStatus().equalsIgnoreCase("indisponivel") || book.getStatus().equalsIgnoreCase("Indisponível")) {
                System.out.println("ISBN: " + book.getIsbn() + " | Título: " + book.getTitle() + " | Autor: " + book.getAuthor()+ " | Gênero " + book.getGenre());
            }
        }
    }

    public void borrowedBook(){
        System.out.println("Livros emprestados:");
        for(Book book : books){
            if(book.getStatus().equalsIgnoreCase("emprestado")) {
                System.out.println("ISBN: " + book.getIsbn() + " | Título: " + book.getTitle() + " | Autor: " + book.getAuthor()+ " | Gênero " + book.getGenre());
            }
        }
    }
    //alterando status do livro
    public void changeStatusBook(int isbn, String newStatus){
        for(Book book : books){
            if(book.getIsbn() == isbn){
               book.setStatus(newStatus);
               System.out.println("Status do livro com ISBN " + isbn + "alterado para: " + newStatus);
               return;//para para o looping
            }
        }
        System.out.println("O livro com ISBN: " + isbn + " Não foi encontratado!");
    }
    public String getAccessLibrary() {
        return accessCode;
    }
    public boolean authenticateLibraryAccess(String accessCodeInput) {
        return accessCode.equals(accessCodeInput);  // Verifica se o código informado é o correto
    }
}
