/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

public class ShapeFactory extends AbstractFactory {

    ShapeFactory() {
        // Constructor implementation goes here
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("TRAINGLE")){
        return new Traingle();
    }
        return null;
}
}
