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
        super(title);
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }
    
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    } 
}