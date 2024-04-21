package Q2;

public class GeometryFactory {
    public static Geometry createGeometry(String type){
        if ("square".equalsIgnoreCase(type)) {
            return new SquareGeometry();
        } else if ("circle".equalsIgnoreCase(type)) {
            return new CircleGeometry();
        } else if("triangle".equalsIgnoreCase(type)){
            return new TriangleGeometry();
        }else {
            throw new IllegalArgumentException("Unknown geometry type: " + type);
        }
    }
}
