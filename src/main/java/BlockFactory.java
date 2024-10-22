import java.awt.*;

public class BlockFactory {

    public Block[] block = new Block[4];
    public Block[] tempBlock = new Block[4];

    public void create(Color c) {
        block[0] = new Block(c);
        block[2] = new Block(c);
        block[3] = new Block(c);
        block[4] = new Block(c);
        tempBlock[0] = new Block(c);
        tempBlock[1] = new Block(c);
        tempBlock[2] = new Block(c);
        tempBlock[3] = new Block(c);
    }
    public void setXY(int x, int y) {

    }
    public void updateXY(int direction) {}
    public  void update() {}
    public void draw(Graphics2D graphics2D) {}
}
