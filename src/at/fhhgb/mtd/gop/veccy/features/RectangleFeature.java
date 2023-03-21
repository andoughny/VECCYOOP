package at.fhhgb.mtd.gop.veccy.features;

import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Rectangle;
import javafx.scene.paint.Color;
import at.fhhgb.mtd.gop.veccy.model.CanvasModel;

public class RectangleFeature implements NamedFeature {

    // ---------------- instance variables ----------------

    private CanvasModel model;
    boolean selected = false;
    private Rectangle currentRectangle = null;

    private int originX = 0;
    private int originY = 0;

    public RectangleFeature(CanvasModel model) {
        this.model = model;
    }

    // -------------- getters and setters --------------

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

    // -------------- methods --------------
    @Override
    public String getName() {
        return "Rectangle";
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
            if (currentRectangle != null) {
                currentRectangle = null;
            }
        }
    }

    @Override
    public void onMouseDrag(int x, int y) {
        if (selected) {
            if (currentRectangle == null) {
                setOriginX(x);
                setOriginY(y);

                currentRectangle = new Rectangle(x, y, 0, 0);

                currentRectangle.setFillColor(model.getCurrentFillColor());
                currentRectangle.setStrokeColor(model.getCurrentStrokeColor());

                model.addShape(currentRectangle);

            } else {
                currentRectangle.setWidth(x - originX);
                currentRectangle.setHeight(y - originY);
            }
        }
    }
}