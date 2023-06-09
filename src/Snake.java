import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimensions;
    public Snake() {
        body = new ArrayList<>();

        Rectangle temp = new Rectangle(Game.dimensions, Game.dimensions);
        temp.setLocation(Game.width / 2 * Game.dimensions, Game.height / 2 * Game.dimensions);
        body.add(temp);

        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 - 2) * d);
        body.add(temp);

    }
    public ArrayList<Rectangle> getBody() {
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }
}
