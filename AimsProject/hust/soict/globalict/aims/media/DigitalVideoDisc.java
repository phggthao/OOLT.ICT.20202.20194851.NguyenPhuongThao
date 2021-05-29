package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public boolean search(String title) {
        String[] tokens = title.split(" ");
        for (String token: tokens) {
            if (this.title.toLowerCase().contains(token) == true) {
                return true;
            }
        }
        return false;
    }    
}