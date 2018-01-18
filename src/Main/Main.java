package main;

import Game.Game;
import display.Display;


public class Main {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static String TITLE = "Tanks";
    public final static int clearcolor = 0x00000000;
    public static final int SCALE = 3;
    public static String TankFilePath = "res/tankFile.txt";
    public static String MapFilePath = "res/MapFile.txt";


    public static void main(String[] args) {

        Game Tanks = new Game();
        Tanks.start();

    }
}


