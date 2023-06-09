import javax.swing.*;

public class Game {

    private Snake player;
    private Food food;
    private Graphics graphics;
    private JFrame window;
    public static final int width = 30;
    public static final int height = 30;
    public static final int dimensions = 20;
    public Game() {
        window = new JFrame();

        window.setTitle("Snake");
        window.setSize(width * dimensions, height * dimensions);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
