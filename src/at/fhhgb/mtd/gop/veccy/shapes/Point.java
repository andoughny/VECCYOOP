package at.fhhgb.mtd.gop.veccy.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Point implements DrawableShape {
    private int x;
    private int y;

    private Color strokeColor;
    private Color fillColor;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle boundingBox() {
        return new Rectangle(this.x, this.y, 1, 1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public int area(){
        return 0;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeOval(this.x, this.y, 3, 3);
    }
}
