import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimensions;

    private String move; //not moving, UP, DOWN, LEFT, RIGHT
    public Snake() {
        body = new ArrayList<>();

        Rectangle temp = new Rectangle(Game.dimensions, Game.dimensions);
        temp.setLocation(Game.width / 2 * Game.dimensions, Game.height / 2 * Game.dimensions);
        body.add(temp);

        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 - 2) * d);
        body.add(temp);

        move = "Nothing";

    }
    public void move(){
        if (move != "Nothing") {
            Rectangle first = body.get(0);
            Rectangle temp = new Rectangle(Game.dimensions, Game.dimensions);
            
            if(move == "Up") {
                temp.setLocation(first.x, first.y - Game.dimensions);
            } else if(move == "Down") {
                temp.setLocation(first.x, first.y + Game.dimensions);
            } else if(move == "Left") {
                temp.setLocation(first.x - Game.dimensions, first.y);
            } else {
                temp.setLocation(first.x + Game.dimensions, first.y);
            }
            body.add(0,temp);
            body.remove(body.size()-1);
        }
    }

    public void grow(){
        Rectangle first = body.get(0);
        Rectangle temp = new Rectangle(Game.dimensions, Game.dimensions);

        if(move == "Up") {
            temp.setLocation(first.x, first.y - Game.dimensions);
        } else if(move == "Down") {
            temp.setLocation(first.x, first.y + Game.dimensions);
        } else if(move == "Left") {
            temp.setLocation(first.x - Game.dimensions, first.y);
        } else {
            temp.setLocation(first.x + Game.dimensions, first.y);
        }
        body.add(0,temp);
    }
    public ArrayList<Rectangle> getBody() {
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }

    public int getX() {
        return body.get(0).x;
    }

    public int getY() {
        return body.get(0).y;
    }

    public void up(){
        move = "UP";
    }
    public void down(){
        move = "DOWN";
    }
    public void left(){
        move = "LEFT";
    }
    public void right(){
        move = "RIGHT";
    }
}
