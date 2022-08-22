package online_media;

import java.util.ArrayList;
import java.util.List;

public class Books extends DigitalVideoDisc{
    List <String>Authors=new ArrayList<>();

    public Books(String title, String category, int cost ,List<String> authors) {
        super(title, category, cost);
        Authors = authors;
    }

}
