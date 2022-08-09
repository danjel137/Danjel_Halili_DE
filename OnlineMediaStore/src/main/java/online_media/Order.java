package online_media;

import java.util.ArrayList;
import java.util.List;

public class Order {
    static List<DigitalVideoDisc> discList=new ArrayList<>();
    static List<DigitalVideoDisc> DVDList=new ArrayList<>();
    static List<DigitalVideoDisc> booksList=new ArrayList<>();

    public static void addDiscList(DigitalVideoDisc dv){
        if(dv.getName().equals("disc")){
            discList.add(dv);
        }else if(dv.getName().equals("DVD")){
            DVDList.add(dv);
        }else booksList.add(dv);
    }


}
