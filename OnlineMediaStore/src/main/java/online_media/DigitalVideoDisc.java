package online_media;

public class DigitalVideoDisc {
    private String name;
    private String title;
    private String category;
    private int cost;
    private String director;

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String name, String title, String category, int cost, String director) {
        this.name = name;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", director='" + director + '\'' +
                '}';
    }
}
