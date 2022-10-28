package project;
import java.util.*;
public class steps {

    private static final Random rnd = new Random();
    public steps(String move,int north,int south,int east,int west){
        if(move.contains("walk") || move.contains("move") || move.contains("travel") || move.contains("wander")) {
            if (move.contains("north") && move.contains("east")) {
                north++;
                south--;
                east++;
                west--;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
            }
            else if(move.contains("north") && move.contains("west")) {
                north++;
                south--;
                east--;
                west++;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
            }
            else if(move.contains("south") && move.contains("east")) {
                north--;
                south++;
                east++;
                west--;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
            }
            else if(move.contains("south") && move.contains("west")) {
                north--;
                south++;
                east--;
                west++;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
            }
            else if(move.contains("north")){
                north++;
                south--;
                Project.setNorth(north);
                Project.setSouth(south);
            }
            else if(move.contains("south")){
                south++;
                north--;
                Project.setSouth(south);
                Project.setNorth(north);
            }
            else if(move.contains("east")){
                east++;
                west--;
                Project.setEast(east);
                Project.setWest(west);
            }
            else if(move.contains("west")){
                west++;
                east--;
                Project.setWest(west);
                Project.setEast(east);
            }
            else{
                RandomDirection(north,south,east,west);
            }
        }
        else{
            System.out.println("You start to think about what you want to do in your head, but then you realise you are stuck in a forest so you better not waist your precious time");
        }
        new Events();
        return;
    }
    public static void RandomDirection(int north, int south, int east, int west){
        int random_number1 = rnd.nextInt(1,8);
        switch (random_number1){
            case 1: {
                north++;
                south--;
                east++;
                west--;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
                break;
            }
            case 2: {
                north++;
                south--;
                east--;
                west++;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
                break;
            }
            case 3: {
                north--;
                south++;
                east++;
                west--;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
                break;
            }
            case 4: {
                north--;
                south++;
                east--;
                west++;
                Project.setNorth(north);
                Project.setEast(east);
                Project.setSouth(south);
                Project.setWest(west);
                break;
            }
            case 5: {
                north++;
                south--;
                Project.setNorth(north);
                Project.setSouth(south);
                break;
            }
            case 6: {
                south++;
                north--;
                Project.setSouth(south);
                Project.setNorth(north);
                break;
            }
            case 7: {
                east++;
                west--;
                Project.setEast(east);
                Project.setWest(west);
                break;
            }
            case 8: {
                west++;
                east--;
                Project.setWest(west);
                Project.setEast(east);
                break;
            }
        }
    }
}
