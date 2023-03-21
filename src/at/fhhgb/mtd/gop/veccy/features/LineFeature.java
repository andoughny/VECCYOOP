package at.fhhgb.mtd.gop.veccy.features;

import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Circle;
import at.fhhgb.mtd.gop.veccy.shapes.Line;

public class LineFeature implements NamedFeature {

    private CanvasModel model;
    boolean selected = false;
    private Line currentLine = null;

    private int originX = 0;
    private int originY = 0;

    public LineFeature(CanvasModel model) {
        this.model = model;
    }


    @Override
    public String getName() {
        return "Line";
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
            if (currentLine != null) {
                currentLine = null;
            }
        }
    }

    @Override
    public void onMouseDrag(int x, int y) {
        if (selected) {
            if (currentLine == null) {
                currentLine = new Line(x, y, x, y);

                currentLine.setFillColor(model.getCurrentFillColor());
                currentLine.setStrokeColor(model.getCurrentStrokeColor());

                model.addShape(currentLine);
            } else {
                currentLine.setX2(x);
                currentLine.setY2(y);
            }
        }
    }
}
