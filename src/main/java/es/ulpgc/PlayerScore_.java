package es.ulpgc;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class PlayerScore_ {



    private List<Integer> rolls;
    Player_ player;
    int[] totalRolls;

    public PlayerScore_(){}


    public PlayerScore_(Player_ player) {
        this.player = player;
        this.rolls = new ArrayList<>();
        this.totalRolls = new int [rolls.size()];
    }

    public PlayerScore_ playerScore(Player_ player, int... rolls) {
        this.player = player;
        this.totalRolls = rolls;
        PlayerScore_ playerScore = new PlayerScore_(player);
        stream(rolls).forEach(playerScore::roll);
        player.setScore(playerScore.totalScore());
        return playerScore;
    }







    public List<Frame> frames() {
        ArrayList<Frame> frames = new ArrayList<>();
        for (int i = 0; i < rolls.size();) {
            frames.add(new Frame(i));
            i += new Frame(i).isStrike() ? 1 : 2;
        }
        return frames;
    }

    public PlayerScore_ roll(int pins) {
        rolls.add(pins);
        return this;
    }

    public Frame frame(int i) {
        return frames().get(i);
    }

    public class Frame {    //CLASE INTERNA PARA LAS TIRADAS
        private int index;

        public Frame(int index) {
            this.index = index;
        }

        public Integer score() {
            if (!isTerminated()) return null;
            if (isSpare()) return roll(index) + roll(index+1) + roll(index+2);
            return roll(index) + roll(index+1);
        }

        private boolean isTerminated() {
            return this.index != rolls.size() - rollsToTerminate();
        }

        private int rollsToTerminate() {
            return isSpare() || isStrike() ? 2 : 1;
        }

        private Integer roll(int index) {
            return rolls.get(index);
        }

        private boolean isSpare() {
            if (index+1 >= rolls.size()) return false;
            return roll(index) + roll(index + 1) == 10;
        }

        public boolean isStrike() {
            return roll(index) == 10;
        }
    }

    public int totalScore(){

        int totalScore = 0;
        for (int i = 0; i < totalRolls.length; i++) {
            totalScore+= totalRolls[i];
        }
        return totalScore;
    }

    public int[] getTotalRolls() {
        int[] rolls_p = new int[totalRolls.length];
        for (int i = 0; i < totalRolls.length; i++) {
            rolls_p[i] = totalRolls[i];
        }
        return rolls_p;
    }
}
