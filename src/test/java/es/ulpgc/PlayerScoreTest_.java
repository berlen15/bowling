package es.ulpgc;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.stream;
import static org.junit.Assert.assertEquals;

public class PlayerScoreTest_ {

    private PlayerScore_ playerScore;
    private Player_ luis;

    private PlayerScore_ playerScore(int... rolls) {
       playerScore = new PlayerScore_(luis);
        stream(rolls).forEach(playerScore::roll);
        return playerScore;
    }

    @Before
    public void setUp() throws Exception { }

    @Test
    public void given_no_rolls_frames_should_be_zero() {
        assertEquals(playerScore.frames().size(),0);

    }

    @Test
    public void given_one_roll_frames_should_be_one_and_score_is_null() {
        assertEquals(playerScore(0).frames().size(),1);
        assertEquals(playerScore(0).frame(0).score(),null);
    }

    @Test
    public void given_two_rolls_frames_should_be_one_and_score_the_sum_of_rolls() {
        assertEquals(playerScore(0, 2).frames().size(), 1);

        //PREGUNTAR
        assertEquals(playerScore(0, 2).frame(0).score(), java.util.Optional.of(2));

    }

    @Test
    public void given_three_rolls_frames_should_be_two() {
        assertEquals(playerScore(0, 2,7).frames().size(), 2);
        assertEquals(playerScore(0,2,7).frame(0).score(), java.util.Optional.of(2));
        assertEquals(playerScore(0,2,7).frame(1).score(),null);

    }

    @Test
    public void given_a_spare_in_the_last_frame_score_should_be_null() {
        assertEquals(playerScore(0, 2,7,3).frames().size(), 2);
        assertEquals(playerScore(0,2,7,3).frame(0).score(), java.util.Optional.of(2));
        assertEquals(playerScore(0,2,7,3).frame(1).score(),null);

    }

    @Test
    public void given_a_strike_followed_by_roll_should_have_two_frames_with_null_score() {
        assertEquals(playerScore(10, 2).frames().size(), 2);
        assertEquals(playerScore(10, 2).frame(0).score(), null);
        assertEquals(playerScore(10, 2).frame(1).score(), null);
    }

    @Test
    public void given_a_spare_in_a_frame_score_should_add_the_following_roll() {
        assertEquals(playerScore(0, 2, 7, 3, 8).frames().size(), 3);
        assertEquals(playerScore(0, 2, 7, 3, 8).frame(0).score(), java.util.Optional.of(2));
        assertEquals(playerScore(0, 2, 7, 3, 8).frame(1).score(), java.util.Optional.of(18));
        assertEquals(playerScore(0, 2, 7, 3, 8).frame(1).score(), null);
    }


}