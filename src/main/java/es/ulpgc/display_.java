package es.ulpgc;


import java.util.List;


public class display_ {
    public static boolean display_game(Game_ game, List<Player_> players, List<PlayerScore_> scorePlayer){

        System.out.println("--------- INFORMACIÓN DE LA PARTIDA ---------");
        System.out.println("PARTIDA EN LA LÍNEA --> " + game.id1);
        System.out.println("NÚMERO DE JUGADORES --> "+players.size());

        System.out.println("*ATENCIÓN: Cada jugador dispondrá de 10 frames. Dependiendo de la\n"
                +"puntuación del frame obtendrá mayor o menor número de rolls");
        System.out.println("----------------------------------------------");

        for (Player_ p : players) {
            System.out.print("Jugador: "+p.getName() + " >>> ");
            System.out.println("Puntuación obtenida: ");
            for(int i=0;i<scorePlayer.size();i++) {
                if(p.getName() == scorePlayer.get(i).player.getName()){
                    for (int j = 0; j < scorePlayer.get(i).getTotalRolls().length; j++) {
                        System.out.print(scorePlayer.get(i).getTotalRolls()[j] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("-------------------------------------------");
        }
        System.out.println("GANADOR/A: " + game.getWinner());
        return true;
    }
}

