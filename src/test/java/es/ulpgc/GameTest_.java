package es.ulpgc;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest_ {
    private static int id = 1;
    private List<Player_> players,playersWinnerTest ,players2, players3;

    private Game_ game1,gameWinnerTest, game2, game3;

    @Before
    public void initialize(){
        players = new ArrayList<Player_>();
        players2 = new ArrayList<Player_>();
        players3 = new ArrayList<Player_>();

        players.add(new Player_("Luis"));
        players.add(new Player_("Carolina"));

        Game_ game1 = new Game_ (players, 1);



    }

    @Test
    public void new_game_should_have_players() {
        assertNotEquals(players.size(),0);
    }

    @Test
    public void winner_test() {
        Player_ pepeluis = new Player_("Pepeluis");
        Player_ pepe = new Player_("Pepe");
        pepeluis.setScore(30);
        pepe.setScore(20);
        playersWinnerTest.add(pepeluis);
        playersWinnerTest.add(pepe);

        gameWinnerTest= new Game_(playersWinnerTest,1);
        assertEquals(gameWinnerTest.getWinner(),"Pepeluis");

    }

    @Test
    public void game_should_have_id() {

        List<Player_> players2 = new ArrayList<Player_>();
        players2.add(new Player_("Luiso"));
        players2.add(new Player_("Carolino"));
        Game_ game2 = new Game_(players2,2);

        List<Player_> players3 = new ArrayList<Player_>();
        players3.add(new Player_("Luisou"));
        players3.add(new Player_("Carolinou"));
        Game_ game3 = new Game_(players3,3);


        assertEquals(game2.getId(),2);
        assertEquals(game3.getId(),3);





    }

}
