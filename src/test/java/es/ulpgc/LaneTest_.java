package es.ulpgc;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class LaneTest_ {
    private Lane_ lane1,lane2, lane3, lane4, lane5, lane6, lane7, lane8, lane9, lane10, lane11;
    private List <Lane_> laneGroup;

    @Before
    public void initialize_lane(){
        laneGroup = new ArrayList<Lane_>();
        lane1 = new Lane_(1);
        lane2 = new Lane_(2);
        lane3 = new Lane_(3);
        lane4 = new Lane_(4);
        lane5 = new Lane_(5);
        lane6 = new Lane_(6);
        lane7 = new Lane_(7);
        lane8 = new Lane_(8);
        lane9 = new Lane_(9);
        lane10 = new Lane_(10);
        lane11 = new Lane_ (11);


        laneGroup.add(lane1);
        laneGroup.add(lane2);
        laneGroup.add(lane3);
        laneGroup.add(lane4);
        laneGroup.add(lane5);
        laneGroup.add(lane6);
        laneGroup.add(lane7);
        laneGroup.add(lane8);
        laneGroup.add(lane9);
        laneGroup.add(lane10);

    }


    @Test
    public void lane_creation_test() {
        Lane_ lane = new Lane_(20);
        assertEquals(lane.getNumberLane(),1);
        lane.lista.clear();
    }

    @Test
    public void finishLane_should_remove_lane_from_list() {
        Lane_ lane2 = new Lane_(30);
        lane2.finishLane(30);
        assertEquals(lane2.getNumberLane(),0);
        lane2.lista.clear();
    }
    @Test
    public void more_than_10_lines_test() {

        assertEquals(laneGroup.size(),10);
    }
}
