package project;
import java.util.*;

public class Project {
    private static int north = 0;
    private static int south = 0;
    private static int east = 0;
    private static int west = 0;

    public static void main(String[] args) {
        StringBuilder endtext = new StringBuilder();
        boolean game = true;
        Scanner input = new Scanner(System.in);
        System.out.println("You are in a forest with no way out,\nYou only hava a dagger\nand you must find your way out");
        while (game) {
            if (north > 3 && east > 3) {
                endtext.append("You got out of the forest");
                game = false;
            } else if (south > 3 && west > 3) {
                endtext.append("You got out of the forest");
                game = false;
            } else if (north > 6) {
                endtext.append("You got out of the forest");
                game = false;
            } else if (south > 6) {
                endtext.append("You got out of the forest");
                game = false;
            } else if (east > 6) {
                endtext.append("You got out of the forest");
                game = false;
            } else if (west > 6) {
                endtext.append("You got out of the forest");
                game = false;
            } else {
                System.out.print("Enter your next move: ");
                String move;
                move = input.nextLine();
                new steps(move,north,south,east,west);

            }
        }
        System.out.print(endtext);
    }

    public static void setNorth(int north) {
        Project.north = north;
    }

    public static void setSouth(int south) {
        Project.south = south;
    }

    public static void setEast(int east) {
        Project.east = east;
    }

    public static void setWest(int west) {
        Project.west = west;
    }
}
