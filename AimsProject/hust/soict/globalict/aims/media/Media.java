package hust.soict.globalict.aims.media;

public abstract class Media {
    protected String id;
    protected String title;
    protected String category;
    protected float cost;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    
    public Media() {
    }

    public Media(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(String id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public Media(String id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
}
