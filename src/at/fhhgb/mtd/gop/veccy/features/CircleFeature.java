package at.fhhgb.mtd.gop.veccy.features;


import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Circle;

public class CircleFeature implements NamedFeature {

    private Circle currentCircle = null;

    private int originX, originY;

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

    boolean selected = false;

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

    }

    @Override
    public void onMouseDrag(int x, int y) {
        if(selected){
            if(currentCircle == null){
                setOriginX(x);
                setOriginY(y);
            }
        }
    }
}
