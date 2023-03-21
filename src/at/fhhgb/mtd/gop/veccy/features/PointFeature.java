package at.fhhgb.mtd.gop.veccy.features;

import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Point;


public class PointFeature implements NamedFeature {

    private CanvasModel model;
    boolean selected = false;
    private Point currentPoint = null;

    private int originX = 0;
    private int originY = 0;

    public PointFeature(CanvasModel model) {
        this.model = model;
    }


    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public void onSelect() {
        selected = true;
    }

    @Override
    public void onDeselect() {
        selected = false;
    }

    @Override
    public void onMouseClick(int x, int y) {
        if (selected) {
            currentPoint = new Point(x, y);

            currentPoint.setFillColor(model.getCurrentFillColor());
            currentPoint.setStrokeColor(model.getCurrentStrokeColor());

            model.addShape(currentPoint);
        }

    }

    @Override
    public void onMouseDrag(int x, int y) {
    }
}
