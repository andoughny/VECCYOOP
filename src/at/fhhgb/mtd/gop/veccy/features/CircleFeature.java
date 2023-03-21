package at.fhhgb.mtd.gop.veccy.features;

import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Circle;

public class CircleFeature implements NamedFeature {

    // ------------- instance variables -------------

    private CanvasModel model;
    boolean selected = false;
    private Circle currentCircle = null;

    private int originX = 0;
    private int originY = 0;

    public CircleFeature(CanvasModel model) {
        this.model = model;
    }

    // ------------ getters and setters ------------

    public int getOriginX() {
        return originX;
    }

    public void setOriginX(int originX) {
        this.originX = originX;
    }

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    // ------------ methods ------------

    public String getName() {
        return "Circle";
    }

    @Override
    public void onSelect() {
        setSelected(true);
    }

    @Override
    public void onDeselect() {
        setSelected(false);
    }

    @Override
    public void onMouseClick(int x, int y) {
        if (selected) {
            if (currentCircle != null) {
                currentCircle = null;
            }
        }
    }

    @Override
    public void onMouseDrag(int x, int y) {
        int distance = (int) Math.sqrt((x - originX) * (x - originX) + (y - originY) * (y - originY));

        if(selected){
            if(currentCircle == null){
                setOriginX(x);
                setOriginY(y);

                currentCircle = new Circle(x, y, 0);

                currentCircle.setFillColor(model.getCurrentFillColor());
                currentCircle.setStrokeColor(model.getCurrentStrokeColor());

                model.addShape(currentCircle);
            }  else {
                currentCircle.setRadius(distance);
            }
        }
    }
}
