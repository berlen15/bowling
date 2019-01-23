package es.ulpgc;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DisplayTest_ {
    private Player_ pepe, andrea, federico;
    private PlayerScore_ pepeScore, andreaScore, federicoScore;
    private List<Player_> players;
    private Game_ game;
    @Before
    public void intialize_display(){

        Player_ pepe = new Player_("Pepe");
        Player_ andrea = new Player_("Andrea");
        Player_ federico = new Player_("Federico");

        pepeScore = new PlayerScore_();
        andreaScore= new PlayerScore_();
        federicoScore= new PlayerScore_();

        pepeScore.playerScore(pepe,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,3);
        andreaScore.playerScore(andrea,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,4);
        federicoScore.playerScore(federico,1,1,0,1,0,1,0,1,0,1,0,1,3,1,0,1,0,1,0,5);

       players = new ArrayList<>();

        players.add(pepe);
        players.add(andrea);
        players.add(federico);

        Game_ game = new Game_(players,1);
    }

    @Test
    public void display_functionality_test() {

        List<PlayerScore_> scorePlayer = new ArrayList<>();
        scorePlayer.add(pepeScore);
        scorePlayer.add(andreaScore);
        scorePlayer.add(federicoScore);


        assertEquals(display_.display_game(game,players,scorePlayer),true);
    }



}
