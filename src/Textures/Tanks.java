package textures;

import display.Display;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static Game.Game.mapSplit;
import static main.Main.HEIGHT;
import static main.Main.SCALE;
import static main.Main.WIDTH;

public class Tanks {

    public static BufferedImage TankMap = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);


    public static Graphics TanksMap = TankMap.getGraphics();


    public static void CreateTankMap(char[] TanknumArr) {
        Graphics2D g2d = (Graphics2D)TanksMap;
       // g2d.setComposite(AlphaComposite.Clear);
     //   g2d.fillRect(0, 0, w, h);

        int i = 0;
        System.out.print(TanknumArr[0]);
        for (int h = 0; h < 13; h++)

        {
            for (int w = 0; w < 13; w++) {
                if (TanknumArr[i] == '1') {
                    mapSplit = textures.Sprites[2];
                }

                Graphics2D g =Display.getGraphics();
              //
            //    g.drawImage(TanksMap, w * 45, h * 45, 5 * SCALE, 5 * SCALE, null);
                TanksMap.drawImage(mapSplit, w * 15, h * 15, 5 * SCALE, 5 * SCALE, null);

                i++;
                mapSplit = null;

            }

            h++;
        }
    }
}

