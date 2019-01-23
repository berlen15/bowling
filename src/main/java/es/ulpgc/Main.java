package es.ulpgc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player_ player1 = new Player_("David");
        Player_ player2 = new Player_("Marta");
        Player_ player3 = new Player_("Marcos");

        List<Player_> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        Game_ game = new Game_(players, 1);

        PlayerScore_ player1Score = new PlayerScore_();
        player1Score.playerScore(player1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,3);

        PlayerScore_ player2Score = new PlayerScore_();
        player2Score.playerScore(player2,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,4);

        PlayerScore_ player3Score = new PlayerScore_();
        player3Score.playerScore(player3,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,5);

        List<PlayerScore_> scorePlayers = new ArrayList<>();
        scorePlayers.add(player1Score);
        scorePlayers.add(player2Score);
        scorePlayers.add(player3Score);

        display_ display = new display_();
        System.out.println(players.size());
        System.out.println(scorePlayers.size());
        display.display_game(game,players,scorePlayers);
        DataBase_ DBGame = new DataBase_();
        DBGame.Database(game);
    }
}
