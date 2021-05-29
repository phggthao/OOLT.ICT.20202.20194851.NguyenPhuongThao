package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {
        
    }

    List<String> getAuthors() {
        return authors;
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
