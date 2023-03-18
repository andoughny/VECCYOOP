package at.fhhgb.mtd.gop.veccy;

import at.fhhgb.mtd.gop.veccy.model.CanvasModel;
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


        for (int i = 0; i < 1500; i++) {
            for (int j = 0; j < 1500; j++) {
                if (i % 25 == 0 && j % 25 == 0) {
                    Rectangle r = new Rectangle(i, j, 25, 25);
                    r.setFillColor(Color.BLUE);
                    model.addShape(r);
                }
                if (i % 50 == 0 && j % 50 == 0) {
                    Rectangle r = new Rectangle(i, j, 25, 25);
                    r.setFillColor(Color.WHITE);
                    model.addShape(r);
                }
            }

        }

        for (int i = 0; i < 1000; i++) {
            if (i % 25 == 0) {
                Line l = new Line(0, i, 1500, i);
                l.setStrokeColor(Color.ORANGE);
                model.addShape(l);
            }
        }


    }
}