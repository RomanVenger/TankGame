package Utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class loadPic {
    public static char[] numArr = new char[250];
    public static char[] TanknumArr = new char[250];

    public static char[] readMap(String path) {
        String s, result;
        StringBuffer sb = new StringBuffer();

        try {
            BufferedReader in = new BufferedReader(new FileReader(path));

            while ((s = in.readLine()) != null) {
                sb.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        result = sb.toString();
        numArr = result.toCharArray();
        return numArr;
    }
    //return numArr of map indexes
   public static char[] readMapTank(String path) {
        String s, result;
        StringBuffer sb = new StringBuffer();

        try {
            BufferedReader in = new BufferedReader(new FileReader(path));

            while ((s = in.readLine()) != null) {
                sb.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        result = sb.toString();
        TanknumArr = result.toCharArray();
        return TanknumArr;
    } //return numArr of map indexes


    public static BufferedImage loadPic(int x, int y, int width, int height) {
        BufferedImage img = null;

        try {
            File file = new File("res/texture_atlas.png");
            img = ImageIO.read(file);
            img = img.getSubimage(x, y, width, height);

        } catch (Exception e) {
            System.out.print("Exeption load fille");
            e.printStackTrace();
        }
        return img;

    } //load picture and return texture from picture
}