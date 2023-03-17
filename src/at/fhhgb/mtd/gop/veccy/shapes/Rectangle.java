package at.fhhgb.mtd.gop.veccy.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle implements DrawableShape {
    private int x;
    private int y;
    private int width;
    private int height;

    private Color fillColor = null;
    private Color strokeColor = null;


    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


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

    //area calculation method
    public int area() {
        return this.width * this.height;
    }

    public Rectangle boundingBox() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }

    //schaut ob rechtecke sich überlappen
    public boolean isOverlapping(Rectangle other) {
        return (Math.min(this.x + this.width, other.x + other.width) >= Math.max(this.x, other.x) &&
                Math.min(this.y + this.height, other.y + other.height) >= Math.max(this.y, other.y));

    }


    //nochmal gettrer methoden -> später mal umordnen :)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {

        if(this.fillColor != null) {
            graphicsContext.setFill(this.fillColor);
            graphicsContext.fillRect(x,y, width, height);
        }

        if(this.strokeColor != null){
            graphicsContext.setStroke(this.strokeColor);
            graphicsContext.strokeRect(x,y, width, height);
        }
    }
}
