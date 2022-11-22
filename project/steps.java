package project;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.util.*;

import static project.Project.frame;

public class steps {
    private static final Player player = new Player();
    private static final Random rnd = new Random();
    private static String text;

    public static String getText() {
        return text;
    }

    public steps(String move){
        int
                north = Project.getNorth(),
                south = Project.getSouth(),
                east = Project.getEast(),
                west =Project.getWest();

        if(move.contains("flee") || move.contains("run") || move.contains("sprint") || move.contains("retreat") || move.contains("walk") || move.contains("move") || move.contains("travel") || move.contains("wander") || move.contains("head") || move.contains("go")) {
            if (move.contains("north") && move.contains("east")) {
                text = "You head north east";
                north++;
                south--;
                east++;
                west--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("north") && move.contains("west")) {
                text = "You head north west";
                north++;
                south--;
                east--;
                west++;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("south") && move.contains("east")) {
                text = "You head south east";
                north--;
                south++;
                east++;
                west--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("south") && move.contains("west")) {
                text = "You head south west";
                north--;
                south++;
                east--;
                west++;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("north")){
                text = "You head north";
                north++;
                south--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("south")){
                text = "You head south";
                south++;
                north--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("east")){
                text = "You head east";
                east++;
                west--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.contains("west")){
                text = "You head north west";
                west++;
                east--;
                Project.setDirection(north, south, east, west);
            }
            else if(move.equals("help help, im stuck in the forest")){
                JOptionPane.showMessageDialog(null,"go in a specific direction");
            }
            else{
                text = "you head in a random direction";
                RandomDirection(north,south,east,west);
            }
            player.setDistanceTraveled();
        }
        else if(move.equals("help help, im stuck in the forest")){
            text = "";
            JOptionPane.showMessageDialog(null,"to play the game you must move using a certain word to describe moving and a direction");
        }
        else if(move.equalsIgnoreCase("die")){
            JOptionPane.showMessageDialog(null,"Good job, you got out of the forest and life in general, good for you");
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
        else{
            text = "You start to think about what you want to do in your head, but then you realise you are stuck in a forest so you better not waist your precious time";
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
