package es.ulpgc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class DataBase_ {
    public String Database(Game_ game){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonGame = gson.toJson(game);
        PrintStream file = null;
        try {
            file = new PrintStream(new File(game.getGameName() +".json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(file);
        System.out.println(jsonGame);
        return jsonGame;
    }
}
