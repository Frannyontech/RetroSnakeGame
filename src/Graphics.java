import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics extends JPanel implements ActionListener {
    private Timer t = new Timer(100, this);
    public String state;

    private Snake s;
    private Food f;
    private Game game;
    public Graphics(Game g) {
        t.start();
        state = "START";

        game = g;
        s = g.getPlayer();
        f = g.getFood();

        //add keyListener to game
        this.addKeyListener(g);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//ActionListener: detects and does action events
//Graphics class: every 100 millisecond it is going to call action perform to repaint the background