package at.fhhgb.mtd.gop.veccy.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements DrawableShape {
    private int x;
    private int y;
    private int radius;

    private Color fillColor;

    private Color strokeColor;


    //getter and setter
    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }


    //constructors
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    //area calculation
    public int area() {
        return (int) ((this.radius * this.radius) * Math.PI);
    }


    //bounding box builder
    public Rectangle boundingBox() {
        return new Rectangle(x-radius, y-radius, 2*radius, 2*radius);
    }


    //draw method
    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(this.fillColor);
        graphicsContext.setStroke(this.strokeColor);
        graphicsContext.fillOval(x,y, radius*2, radius*2);
        graphicsContext.strokeOval(x,y, radius*2, radius*2);
    }
}