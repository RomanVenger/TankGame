package textures;

import Utils.loadPic;
import display.Display;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static Game.Game.mapSplit;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import static main.Main.*;
import static textures.textures.Sprites;

public class Map {
    public static BufferedImage map = new BufferedImage(WIDTH, HEIGHT, TYPE_INT_RGB);

    public static void CreateMap(char[] numArr) {

        Graphics Map = map.getGraphics();
        Graphics g = map.getGraphics();
        loadPic.readMap(MapFilePath);
        int h = 0, i = 0;
        while (h < 13) {
            for (int w = 0; w < 13; w++) {
                if (numArr[i] == '0') {
                    mapSplit = Sprites[21];
                }
                if (numArr[i] == '1') {
                    mapSplit = Sprites[39];
                }
                if (numArr[i] == '2') {
                    mapSplit = Sprites[16];
                }


                if (numArr[i] == '5') {
                    mapSplit = Sprites[62];
                }
                if (numArr[i] == '3') {
                    mapSplit = Sprites[63];
                }
                if (numArr[i] == '6') {
                    mapSplit = Sprites[1];
                }
                if (numArr[i] == '4') {
                    mapSplit = Sprites[64];

                }

                //   mapSplit = Tanks.TankMap.getSubimage(w * 15, h * 15, 5 * SCALE, 5 * SCALE);
                //  Map.drawImage(mapSplit, w * 15, h * 15, 5 * SCALE, 5 * SCALE, null);


                textures.img1 = mapSplit;


                g.drawImage(mapSplit, w * 15, h * 15, 5 * SCALE, 5 * SCALE, null);


                i++;
                mapSplit = null;
            }
            h++;

        }

    }


}
