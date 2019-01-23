package es.ulpgc;

public class Player_ {
    private String name;
    private Integer score;
    private Integer frames;
    private Player_ player;

    public Player_(String name) {
        this.name = name;
        score = 0;
        frames = 10;
    }

    public Integer getScore() {
        return score;
    }
    public void setName(String name){
        player.name=name;
    }

    public String getName() {
        return name;
    }

    public Integer getFrames() {
        return frames;
    }

    public void setScore(Integer score){
        this.score = score;
    }
}
