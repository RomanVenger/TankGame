package Game;

import Controls.Input;
import Controls.InputMain;
import Utils.Timer;
import Utils.loadPic;
import display.Display;
import textures.Map;
import textures.Tanks;
import textures.textures;
import java.awt.*;
import java.awt.image.BufferedImage;

import static Utils.loadPic.TanknumArr;
import static Utils.loadPic.numArr;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import static main.Main.*;

public class Game implements Runnable {

    public static final double          FPS = 80;
    public static final double          UPDATE_INTERVAL = Timer.SECOND / FPS;
    private static boolean              running;
    private static Thread               GameThread;
    public static BufferedImage         mapSplit = new BufferedImage(16, 4, TYPE_INT_ARGB);
    private Graphics2D			        graphics;
    public  static InputMain inputMain;

    public Game() {
        running = false;
        Display.create(WIDTH, HEIGHT, TITLE, clearcolor);
        graphics = Display.getGraphics();
    }

    public void start() {

        if (running)
            return;
        running = true;
        GameThread = new Thread(this);
        GameThread.start();
        textures.createSprites();
        new Player();
        inputMain= new InputMain();
        loadPic.readMapTank(TankFilePath);
        loadPic.readMap(MapFilePath);
        Tanks.CreateTankMap(TanknumArr);
        Map.CreateMap(numArr);

    }

    public static void stop() {

    }

    private void update() {


    }

    private  void render() {
        Graphics g = Display.getGraphics();

        g.drawImage(Map.map, 0, 0, WIDTH*5, HEIGHT*5, null);
        g.drawImage(Tanks.TankMap, 0, 0, 1400*4, 800*4, null);


        Display.swapBuffers();
    }


    private static void clean() {

    }

    @Override
    public void run() {

        boolean render = false;
        long delta;

        int fps =0;
        long frameTime = 11;
        long lastTime = Timer.nowTime();

        while (running) {

           long nowTime = System.nanoTime();
            delta = nowTime - lastTime;

            while (delta >= UPDATE_INTERVAL) {
                if (delta >= 2 * UPDATE_INTERVAL)
                    Display.window.setTitle("prosadka");
                update();
                delta -= UPDATE_INTERVAL;
                render = true;
            }

            if (render) {
                render();
                lastTime = System.nanoTime();
                fps++;
                render = false;

                if (((System.nanoTime() - frameTime) >= 1200000000)) {
                   Display.window.setTitle("TANKS" + "   " + fps);
                    fps = 0;
                    frameTime = Timer.nowTime();
                }
            }
        }
    }
}


