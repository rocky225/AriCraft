package rocky.android.aricraft.view;

/**
 * Created by Acer on 2014/10/1.
 */
public class MyAriCraft {
    int aX;
    int aY;
    int x;
    int y;
    int move2X;
    int move2Y;

    public void move2(int m2x, int m2y) {
        this.move2X = m2x;
        this.move2Y = m2y;
    }

    public void contain(int x,int y) {

    }

    public void move() {
        if(move2X > x) {
            aX = Math.abs(aX);
        } else {
            aX = -1*aX;
        }
        if(move2Y > y) {
            aY = Math.abs(aY);
        } else {
            aY = -1*aY;
        }

    }

    public void draw() {}
}
