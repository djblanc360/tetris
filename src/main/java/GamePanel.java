
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    final int FPS = 60; // game loop
    Thread gameThread; // run game loop

    GameManager manager;

    public GamePanel() {
        // panel settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);

        manager = new GameManager();
    }
    public void Launch() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    // starting thread will auto call run()
    @Override
    public void run() {

        // game loop
        double drawInterval = (double) 1000000000 /FPS; // 60 times per second
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(gameThread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint(); // draw objects, paintComponent
                delta--;
            }
        }

        // draw objects
    }

    // update, (object positions)
    private void update() {
        manager.update();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        manager.draw(graphics2D);
    }
}
