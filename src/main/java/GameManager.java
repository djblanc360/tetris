import java.awt.*;

/**
 * draw play area
 * manage blocks
 * handle gameplay actions:
 * - deleting lines, adding scores, etc
 */
public class GameManager {

    // main area
    final int WIDTH  = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static  int top_y;
    public static int bottom_y;
    // a single block is 30 pixels
    // so 12 blocks horizontally

    // Block Factory
    BlockFactory currentBlock;
    final int BLOCK_START_X;
    final int BLOCK_START_Y;

    // timed rendering
    public static int dropInterval = 60; // block drops every 60 frames (1 sec)

    public GameManager() {
        // main area frame
        left_x = (GamePanel.WIDTH/2) - (WIDTH/2); // 1280/2 - 360/2 = 460
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;

        BLOCK_START_X = left_x + (WIDTH/2) - Block.SIZE;
        BLOCK_START_Y = top_y + Block.SIZE;

        // set starting block at top of window
        currentBlock = new Block_L1();
        currentBlock.setXY(BLOCK_START_X, BLOCK_START_Y);

    }

    public void update() {
        currentBlock.update();
    }

    public void draw(Graphics2D graphics2D) {

        // main window
        graphics2D.setColor(Color.white);
        graphics2D.setStroke(new BasicStroke(4f));
        graphics2D.drawRect(left_x-4,top_y-4, WIDTH+8, HEIGHT+8);

        // mini window (next block)
        int x = right_x + 100;
        int y = bottom_y - 200;
        graphics2D.drawRect(x, y, 200, 200);
        graphics2D.setFont(new Font("Arial", Font.PLAIN, 30));
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.drawString("next", x+60, y+60);

        // draw current block
        if (currentBlock != null) {
            currentBlock.draw(graphics2D);
        }
    }

}
