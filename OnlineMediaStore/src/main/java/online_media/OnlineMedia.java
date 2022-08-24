package online_media;
import java.io.IOException;
import java.util.Scanner;

import static online_media.Order.listWithDigitalVideoDisc;


public class OnlineMedia {
    static Scanner scanner = new Scanner(System.in);

    public static void addDigitalVideoDisc (Object o){
        listWithDigitalVideoDisc.add((DigitalVideoDisc) o);
    }
    public static void main(String[] args) throws IOException {
        DigitalVideoDisc firstDigitalVideoDisc = new DigitalVideoDisc("aa", "first", 500, "bb", 25);
        DigitalVideoDisc firstDigitalVideoDisc1 = new DigitalVideoDisc("aa", "first", 500, "bb", 25);

        addDigitalVideoDisc(firstDigitalVideoDisc1);
        addDigitalVideoDisc(firstDigitalVideoDisc);

//        listWithDigitalVideoDisc.add(firstDigitalVideoDisc);
//        listWithDigitalVideoDisc.add(firstDigitalVideoDisc1);
        Order order = new Order();
        order.createJsonWithObjectValue();
        order.createFileWithObjectValue();

        System.out.println(listWithDigitalVideoDisc);

    }
}

