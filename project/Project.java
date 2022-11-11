package project;
import java.util.*;

@SuppressWarnings("ALL")
public class Project {
    private static Random random = new Random();
    private static int north = 0;
    private static int south = 0;
    private static int east = 0;
    private static int west = 0;
    private static int northborder = random.nextInt(50,75);
    private static int southborder = random.nextInt(50,75);
    private static int eastborder = random.nextInt(50,75);
    private static int westborder = random.nextInt(50,75);
    private static int northeastborder = random.nextInt(25,50);
    private static int southwestborder = random.nextInt(25,50);
    public static boolean game;
    public static String endtext;

    public static void main(String[] args) {
        game = true;
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a forest with no way out,\nYou only hava a dagger\nand you must find your way out");
        while (game) {
            if (north > northeastborder && east > northeastborder) {
                endtext = "You got out of the forest";
                game = false;
            } else if (south > southwestborder && west > southwestborder) {
                endtext = "You got out of the forest";
                game = false;
            } else if (north > northborder) {
                endtext = "You got out of the forest";
                game = false;
            } else if (south > southborder) {
                endtext = "You got out of the forest";
                game = false;
            } else if (east > eastborder) {
                endtext = "You got out of the forest";
                game = false;
            } else if (west > westborder) {
                endtext = "You got out of the forest";
                game = false;
            } else {
                System.out.print("Enter your next move: ");
                String move;
                move = input.nextLine();
                new steps(move);

            }
        }
        System.out.print(endtext);
    }

    public static void setDirection(int north,int south,int east,int west) {
        Project.north = north;
        Project.south = south;
        Project.east = east;
        Project.west = west;
    }

    public static int getNorth() {
        return north;
    }

    public static int getSouth() {
        return south;
    }

    public static int getEast() {
        return east;
    }

    public static int getWest() {
        return west;
    }
}
