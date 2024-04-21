package Q2;

public class main {
    public static void main(String[] args) {
        Geometry square = GeometryFactory.createGeometry("square");
        square.draw();
        Geometry circle = GeometryFactory.createGeometry("circle");
        circle.draw();
    }
}
