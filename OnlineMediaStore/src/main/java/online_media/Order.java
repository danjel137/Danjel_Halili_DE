package online_media;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {

    public static List<DigitalVideoDisc> listWithDigitalVideoDisc = new ArrayList<>();

    public   void createFileWithObjectValue() throws IOException {
        FileWriter allDigitalVideoDisc = new FileWriter("C:\\Users\\HP\\IdeaProjects\\Danjel_Halili_DE\\OnlineMediaStore\\src\\main\\resources\\properties.txt");
        for (DigitalVideoDisc dg : listWithDigitalVideoDisc) {
            allDigitalVideoDisc.write( dg + "\n");
        }
        allDigitalVideoDisc.close();
    }
    public void writeListFromFile(){

    }

    public   void createJsonWithObjectValue() {

        ObjectMapper objMap = new ObjectMapper();
        try {
            objMap.writeValue(new File("C:\\Users\\HP\\IdeaProjects\\Danjel_Halili_DE\\OnlineMediaStore\\src\\main\\resources\\allDigitalVideoDisc.json"), listWithDigitalVideoDisc);

        } catch (final Exception e) {

            e.printStackTrace();
        }
    }

    public   void fetchJsonWithObjectValue() {

        try {

            ObjectMapper mapper = new ObjectMapper();
            JsonFactory f = new JsonFactory();
            List<DigitalVideoDisc> lstUser;
            JsonParser jp = f.createJsonParser(new File("src/main/resources/disc.json"));
            TypeReference<List<DigitalVideoDisc>> tRef = new TypeReference<>() {
            };
            lstUser = mapper.readValue(jp, tRef);

            System.out.println(lstUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
