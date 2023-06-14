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
        state = "Start";

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

        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, Game.width * Game.dimensions, Game.height * Game.dimensions);

        //paint background
        if(state == "Start") {
            g2d.setColor(Color.white);
            g2d.drawString("Press Any Key", Game.width / 2 * Game.dimensions - 40, Game.height / 2 * Game.dimensions - 20);
        } else if (state == "Running") {
            //paint food
            g2d.setColor(Color.red);
            g2d.fillRect(f.getX() * Game.dimensions, f.getY() * Game.dimensions, Game.dimensions, Game.dimensions);

            g2d.setColor(Color.green);
            for(Rectangle r : s.getBody()) {
                g2d.fill(r);
            }
        } else {
            g2d.setColor(Color.white);
            g2d.drawString("Your Score " + (s.getBody().size() - 3), Game.width / 2 * Game.dimensions - 40, Game.height / 2 * Game.dimensions - 20);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//ActionListener: detects and does action events
//Graphics class: every 100 millisecond it is going to call action perform to repaint the background