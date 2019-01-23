package es.ulpgc;

import java.util.ArrayList;

public class Lane_ {
    ArrayList<Integer> lista = new ArrayList();
    int lane_number = 0;

    public Lane_(int id) {

        if(lista.size() <= 9) {
            lista.add(id);
            lane_number = lista.indexOf(id);
        }else{
            System.out.println("TODAS LAS LÍNEAS ESTÁN SIENDO UTILIZADAS");
        }
    }

    public void finishLane(int id){
        for (Integer i:lista) {
            if(i.equals(id)){
                lista.remove(((Integer) id));
                break;
            }
        }
    }
    public int getNumberLane(){
        return lista.size();
    }
}
