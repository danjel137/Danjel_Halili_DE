package online_media;

public abstract class Media extends  CompactDisc{
    private String title;
    private String category;
    private int cost;
    private String director;
    private int length;

    public Media(String title, String category, int cost, String director, int length) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }

    public Media(String title, String category, int cost) {
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", director='" + director + '\'' +
                ", length=" + length +
                '}';
    }
}
