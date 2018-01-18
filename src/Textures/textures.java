package textures;

import Utils.loadPic;
import display.Display;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static Game.Game.mapSplit;
import static main.Main.SCALE;


public class textures {

    public static BufferedImage[] Sprites = new BufferedImage[400];
    public static BufferedImage img1, img2;

    public static BufferedImage joinBufferedImage(BufferedImage img1, BufferedImage img2) {
        int offset = 5;
        int width = img1.getWidth() + img2.getWidth() + offset;
        int height = Math.max(img1.getHeight(), img2.getHeight()) + offset;
        BufferedImage newImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = newImage.createGraphics();
        Color oldColor = g2.getColor();
        g2.setPaint(Color.BLACK);
        g2.fillRect(0, 0, width, height);
        g2.setColor(oldColor);
        g2.drawImage(img1, null, 0, 0);
        g2.drawImage(img2, null, img1.getWidth() + offset, 0);
        g2.dispose();

        return newImage;}

    public static void createSprites() {

        int i = 0, h = 0;
        while (h < 16 * 16) {

            for (int w = 0; w < 23 * 16; w = w + 16) {
                Sprites[i] = loadPic.loadPic(w, h, 16, 16);
                i++;


            }
            h = h + 16;

        }

    }
}