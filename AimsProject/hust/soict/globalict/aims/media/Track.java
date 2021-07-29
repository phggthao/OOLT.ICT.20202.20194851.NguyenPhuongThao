package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.playable.Playable;

public class Track implements Playable, Comparable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track() {
    }
    public Track(String title) {
        this.title = title;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public boolean equals(Track t) {// override the equals(Object o) method
        if (this.title == t.getTitle() && this.length == t.getLength()) return true;
        else return false;
    }

    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    
    @Override
    public int compareTo(Object o) {
        o = (Track) o;
        if (equals(o)) return 1;
        else return 0;
    }
}
