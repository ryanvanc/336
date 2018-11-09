package library;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class libraryData {

    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        libraryCard[] array = cardData();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String s = gson.toJson(array);
        FileWriter writer = new FileWriter("cards.json");
        gson.toJson(array, writer);
        writer.flush();

    }
    private static libraryCard[] cardData()
    {
        libraryCard card1 = new libraryCard(100, "Paulson");
        libraryCard card2 = new libraryCard(101, "Porter");
        libraryCard card3 = new libraryCard(102, "Rabe");
        libraryCard card4 = new libraryCard(103, "Peters");
        libraryCard card5 = new libraryCard(104, "Bates");
        libraryCard[] cardData = new libraryCard[5];
        cardData[0] = card1;
        cardData[1] = card2;
        cardData[2] = card3;
        cardData[3] = card4;
        cardData[4] = card5;
        return cardData;
    }

}
