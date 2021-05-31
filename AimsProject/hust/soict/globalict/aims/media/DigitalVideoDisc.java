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
    public DigitalVideoDisc(String id, String title) {
        super(id, title);
    }
    public DigitalVideoDisc(String id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public DigitalVideoDisc(String id, String title, String category, float cost, String director) {
        super(id, title, category, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }
}