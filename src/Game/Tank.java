package Game;

import java.util.Random;

import static main.Main.HEIGHT;
import static main.Main.WIDTH;

/**
 * Created by romanvenger on 26.09.17.
 */
public class Tank {
    public  static int id=0;
    private int heatlh,x,y,Dx=1,Dy=1;
    private  enum   direction{ left,right, up, down }
    direction direct;

    Random r = new Random();

     public Tank(){

        id++;
        heatlh=100;
        this.x= r.nextInt(WIDTH);
        this.y=r.nextInt(HEIGHT);
        this.direct=direction.up;
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public  void setDy()
    {
        this.y+=Dy;
    }
    public void setDx(int dx)
    {

        this.x+=Dx;

    }
    public void setDirect(direction direct)
    {
        this.direct=direct;
    }
    public void changeHealth(int heatlh)
    {
        this.heatlh=heatlh;
    }


}
