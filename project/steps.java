package project;
import javax.swing.*;
import java.util.*;
public class steps {
    private static final Player player = new Player();
    private static final Random rnd = new Random();
    public steps(String move){
        int
                north = Project.getNorth(),
                south = Project.getSouth(),
                east = Project.getEast(),
                west =Project.getWest();

        if(move.contains("walk") || move.contains("move") || move.contains("travel") || move.contains("wander") || move.contains("head")) {
            if (move.contains("north") && move.contains("east")) {
                north++;
                south--;
                east++;
                west--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("north") && move.contains("west")) {
                north++;
                south--;
                east--;
                west++;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("south") && move.contains("east")) {
                north--;
                south++;
                east++;
                west--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("south") && move.contains("west")) {
                north--;
                south++;
                east--;
                west++;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("north")){
                north++;
                south--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("south")){
                south++;
                north--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("east")){
                east++;
                west--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("west")){
                west++;
                east--;
                Project.setDirection(north, south, east, west);
            }
            else{
                RandomDirection(north,south,east,west);
            }
            player.setDistanceTraveled();
        }
        else{
            JOptionPane.showMessageDialog(null,"You start to think about what you want to do in your head, but then you realise you are stuck in a forest so you better not waist your precious time");
        }
    }
    public static void RandomDirection(int north, int south, int east, int west){
        int random_number1 = rnd.nextInt(1,8);
        switch (random_number1){
            case 1: {
                north++;
                south--;
                east++;
                west--;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 2: {
                north++;
                south--;
                east--;
                west++;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 3: {
                north--;
                south++;
                east++;
                west--;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 4: {
                north--;
                south++;
                east--;
                west++;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 5: {
                north++;
                south--;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 6: {
                south++;
                north--;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 7: {
                east++;
                west--;
                Project.setDirection(north, south, east, west);
                break;
            }
            case 8: {
                west++;
                east--;
                Project.setDirection(north, south, east, west);
                break;
            }
        }
        player.setDistanceTraveled();
    }
}
