package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    List<String> getAuthors() {
        return authors;
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, List<String> authors) {
        super(title, category);
        this.authors = authors;
        //TODO: check author condition
    }

    void addAuthor(String authorName) {
        if (!authors.contains(authorName)) authors.add(authorName);
        
        else System.out.println("This author's name has already been added to the list.");
    }

    void  removeAuthor(String authorName) {
        if (authors.contains(authorName)) authors.remove(authorName);

        else System.out.println("This author's name is not presented in the list.");
    }
}
