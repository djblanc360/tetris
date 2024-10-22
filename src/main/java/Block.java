import java.awt.*;

public class Block extends Rectangle {
    public int x, y;
    public static final int SIZE = 30; // 30x30 block
    public Color color;

    public Block(Color c) {
        this.color = c;
    }
    public void draw(Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillRect(x, y, SIZE, SIZE);
    }

}
