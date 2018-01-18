package textures;
 public class  move
 {
    public int dx,dy;
    public  int x,y;


         public move(int x, int y, int dx, int dy)
    {
        this.dx = dx;
        this.dy = dy;
        this.x = x;
        this.y = y;
    }
        public int getDx()
            {

                return dx;
            }
        public int getDy()
        {
            return dy;
        }
        public int getx()
        {
            return x;
        }
        public int gety()
        {
            return y;
        }
        public void setDy(int dy)
        {
            this.dy=dy;
        }
        public void setDx(int dx)
    {

        this.dx=dx;
    }
         public void setX(int x)
    {
        this.x=x;
    }
         public void setY(int y)
    {
        this.y=y;
    }


}
