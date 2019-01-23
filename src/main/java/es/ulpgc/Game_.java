package es.ulpgc;

import java.util.List;

public class Game_ {
    private final List<Player_> players;
    int id1;
    Lane_ lane;

    public Game_(List<Player_> players, int id1) {
        this.players = players;
        this.id1=id1;
        lane = new Lane_(id1);
    }

    public Game_(List<Player_> players, List<Player_> players1) {

        this.players = players1;
    }

    public int getId() {
        return this.id1;
    }

    public List<Player_> getPlayers() {
        return players;
    }

    public String getWinner(){
        int aux = 0;
        String winner_name = "";

        for (Player_ p : players) {
            if(p.getScore() > aux){
                aux = p.getScore();
                winner_name = p.getName();
            }
        }
        return winner_name;
    }
    public String getGameName(){
        return "Game_number_" + id1;
    }

    public int getSizeGame(){
        return players.size();
    }
}
