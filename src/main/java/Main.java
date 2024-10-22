import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel panel = new GamePanel();
        window.add(panel);
        window.pack(); // panel becomes size of window

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.Launch();
    }
}
