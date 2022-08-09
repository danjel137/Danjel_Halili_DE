package online_media;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static online_media.Order.*;


public class OnlineMedia {
    public static void main(String[] args) throws IOException {
        ObjectMapper objMap = new ObjectMapper();

        DigitalVideoDisc disc = new DigitalVideoDisc("disc", "music", "first", 300, "Danjel");
        DigitalVideoDisc DVD = new DigitalVideoDisc("DVD", "movie", "first", 400, "Danjel");
        DigitalVideoDisc DVD1 = new DigitalVideoDisc("DVD", "movie", "second", 700, "Danjel");
        DigitalVideoDisc books = new DigitalVideoDisc("books", "rich dad poor dad", "first", 400, "Danjel");
        List<DigitalVideoDisc> digitalVideoDiscs = List.of(disc, DVD, DVD1, books);

        try {
            objMap.writeValue(new File("src/main/resources/disc.json"), digitalVideoDiscs);

        } catch (final Exception e) {

            e.printStackTrace();
        }

        try{

        ObjectMapper mapper = new ObjectMapper();
        JsonFactory f = new JsonFactory();
        List<DigitalVideoDisc> lstUser;
        JsonParser jp = f.createJsonParser(new File("src/main/resources/disc.json"));
        TypeReference<List<DigitalVideoDisc>> tRef = new TypeReference<>() {};
        lstUser = mapper.readValue(jp, tRef);

        System.out.println( lstUser);}
        catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



//        order.digitalVideoDiscs = digitalVideoDiscs;
//
//        objMap.writeValue(new File("disk.json"), order);
//
//        var order1 = objMap.readValue(new File("disk.json"), ListOrderClass.class);
//        System.out.println(order1.digitalVideoDiscs.get(0));

        addDiscList(disc);
        addDiscList(DVD);
        addDiscList(DVD1);
        addDiscList(books);


        FileWriter discListWrite = new FileWriter("src/main/resources/discList.txt");
        for (DigitalVideoDisc str : discList) {
            discListWrite.write(str + "\n");
        }
        discListWrite.close();

        FileWriter DVDListWrite = new FileWriter("src/main/resources/dvdList.txt");
        for (DigitalVideoDisc str : DVDList) {
            DVDListWrite.write(str + "\n");
        }
        DVDListWrite.close();

        FileWriter booksListWrite = new FileWriter("src/main/resources/booksList.txt");
        for (DigitalVideoDisc str : booksList) {
            booksListWrite.write(str + "\n");
        }
        booksListWrite.close();
    }


}
