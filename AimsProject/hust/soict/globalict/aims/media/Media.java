package hust.soict.globalict.aims.media;

public class Media {
    protected String id;
    protected String title;
    protected String category;
    protected float cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
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
