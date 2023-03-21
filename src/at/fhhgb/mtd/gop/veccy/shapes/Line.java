package at.fhhgb.mtd.gop.veccy.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line implements DrawableShape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color fillColor;
    private Color strokeColor;

    //getter and setter
    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getStrokeColor() { return strokeColor; }

    public void setStrokeColor(Color strokeColor) { this.strokeColor = strokeColor; }

    //konstruktor
    public Line(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle boundingBox(){

        int x = Math.min(this.x1, this.x2);
        int y = Math.min(this.y1, this.y2);
        int width = Math.max(x1, x2) - x;
        int height = Math.max(y1, y2) - y;

        return new Rectangle(x, y, width, height);
    }

    public int area(){
        return 0;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeLine(x1, y1, x2, y2);
        graphicsContext.setStroke(this.strokeColor);
    }

    public void setX2(int x) {
        this.x2 = x;
    }

    public void setY2(int y) {
        this.y2 = y;
    }
}
