import java.awt.*;

public class Block_L1 extends BlockFactory {

    public Block_L1() {
        create(Color.orange);
    }

    public void setXY(int x, int y) {
        //  o
        //  o  <<=
        //  o o
        //  set to middle block to be center of rotation
        //  when rotated, position doesn't change
        block[0].x = x;
        block[0].y = y;

        block[1].x = block[0].x;
        block[1].y = block[0].y - Block.SIZE;
        block[2].x = block[0].x;
        block[2].y = block[0].y + Block.SIZE;
        block[3].x = block[0].x + Block.SIZE;
        block[3].y = block[0].y + Block.SIZE;

    }
}
