import java.awt.*;

public class BlockFactory {

    public Block[] block = new Block[4];
    public Block[] tempBlock = new Block[4];
    int autoDropCounter = 0;

    public void create(Color c) {
        block[0] = new Block(c);
        block[1] = new Block(c);
        block[2] = new Block(c);
        block[3] = new Block(c);
        tempBlock[0] = new Block(c);
        tempBlock[1] = new Block(c);
        tempBlock[2] = new Block(c);
        tempBlock[3] = new Block(c);
    }
    public void setXY(int x, int y) {

    }
    public void updateXY(int direction) {}
    public  void update() {
        autoDropCounter++; // counts every frame
        if (autoDropCounter == GameManager.dropInterval) {
            // block drops
            block[0].y += Block.SIZE;
            block[1].y += Block.SIZE;
            block[2].y += Block.SIZE;
            block[3].y += Block.SIZE;
            autoDropCounter = 0; // resets counter
        }
    }
    public void draw(Graphics2D graphics2D) {

        int spacing = 2; // to make smaller, distinguishable blocks without changing x & y
        graphics2D.setColor(block[0].color);
        graphics2D.fillRect(block[0].x+spacing, block[0].y+spacing, Block.SIZE-(spacing*2), Block.SIZE-(spacing*2));
        graphics2D.fillRect(block[1].x+spacing, block[1].y+spacing, Block.SIZE-(spacing*2), Block.SIZE-(spacing*2));
        graphics2D.fillRect(block[2].x+spacing, block[2].y+spacing, Block.SIZE-(spacing*2), Block.SIZE-(spacing*2));
        graphics2D.fillRect(block[3].x+spacing, block[3].y+spacing, Block.SIZE-(spacing*2), Block.SIZE-(spacing*2));
    }
}
