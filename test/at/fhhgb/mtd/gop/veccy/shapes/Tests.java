package at.fhhgb.mtd.gop.veccy.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*trotz konvention leider alle tests in einem file,
hatte nicht mehr genug zeit,
nächstes mal ist es wie es die konvention verlangt! :) */


class RectangleBoundingBoxCircleTest {
    @Test
    void testBoundingBox() {
        Circle circle = new Circle (0, 0, 5);

        Rectangle box = circle.boundingBox();
        Rectangle rectangle = new Rectangle(-5, -5, 10, 10);

        //vergleiche mit getter anstatt objekte miteinander zu vergleichen
        assertEquals(rectangle.getX(), box.getX());
        assertEquals(rectangle.getY(), box.getY());
        assertEquals(rectangle.getWidth(), box.getWidth());
        assertEquals(rectangle.getHeight(), box.getHeight());
    }
}

class RectangleTest {
    @Test //testet die area funktion eines rectangles
    void testArea() {
        Rectangle rectangle = new Rectangle(0, 0, 42, 12);

        assertEquals(504, rectangle.area());
        assertNotEquals(123, rectangle.area());
    }
}


class CircleTest{
    @Test //testet die area funktion eines circles
    void testArea() {
        Circle circle = new Circle(0, 0, 10);

        assertEquals(314, circle.area());
        assertNotEquals(310, circle.area());
    }
}

class PointTest{
    @Test //testet koordinaten eines points
    void testPointCoordinates() {
        Point point = new Point(0,0);

        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }
}

class PointBorderBoxTest{
    @Test //testet ob die boundingbox eines points eh 1x1 pixel groß ist
    void testPointBoundingbox() {
        Point point = new Point (0,0);
        Rectangle rectangle = point.boundingBox();

        assertEquals(1, rectangle.getWidth());
        assertEquals(1, rectangle.getHeight());

    }
}

class OverlappingTest {
    @Test //testet die overlappingfunktion
    void testOverlapping() {
        Rectangle rectangle1 = new Rectangle(0,0,10,10);
        Rectangle rectangle2 = new Rectangle(0,0,5,5);
        Rectangle rectangle3 = new Rectangle(20,20, 1,1);

        //soll overlappen
        assertTrue(rectangle1.isOverlapping(rectangle2));

        //soll nicht overlappen
        assertFalse(rectangle1.isOverlapping(rectangle3));
    }
}