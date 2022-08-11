package online_media;

public class DigitalVideoDisc {

    private String title;
    private String category;
    private int cost;
    private String director;
    private int length;

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String title, String category, int cost, String director, int length) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }


    public DigitalVideoDisc(String title, String category, int cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", director='" + director + '\'' +
                ", length=" + length +
                '}';
    }
}
