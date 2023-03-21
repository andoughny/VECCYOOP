package at.fhhgb.mtd.gop.veccy;

import at.fhhgb.mtd.gop.veccy.features.CircleFeature;
import at.fhhgb.mtd.gop.veccy.features.LineFeature;
import at.fhhgb.mtd.gop.veccy.features.PointFeature;
import at.fhhgb.mtd.gop.veccy.features.RectangleFeature;
import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
import at.fhhgb.mtd.gop.veccy.model.NamedFeature;
import at.fhhgb.mtd.gop.veccy.shapes.Circle;
import at.fhhgb.mtd.gop.veccy.shapes.Line;
import at.fhhgb.mtd.gop.veccy.shapes.Point;
import at.fhhgb.mtd.gop.veccy.shapes.Rectangle;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;


public class Veccy extends Application {
    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {

        VeccyGUI veccyGUI = new VeccyGUI(stage);
        CanvasModel model = veccyGUI.getModel();

        model.addFeature(new CircleFeature());
        model.addFeature(new LineFeature());
        model.addFeature(new PointFeature());
        model.addFeature(new RectangleFeature());

        Color fillColor = model.getCurrentFillColor();
        Color strokeColor = model.getCurrentFillColor();

    }
}