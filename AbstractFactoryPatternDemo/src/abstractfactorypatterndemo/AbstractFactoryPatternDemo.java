/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author sp21-bse-044
 */
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
       Shape shape6 = shapeFactory.getShape("TRAINGLE");
      //call draw method of Shape Square
      shape6.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
     
      Shape shape5 = shapeFactory1.getShape("TRAINGLE");
      //call draw method of Shape Square
      shape5.draw();
       TriangleFactory singleBorderFactory = (TriangleFactory) new SingleBorderTriangleFactory();
        TriangleFactory doubleBorderFactory = new DoubleBorderTriangleFactory();

        // Create and display the new products
        Traingle doubleBorderTriangle = doubleBorderFactory.createTriangle();
        doubleBorderTriangle.draw();

        Traingle doubleBorderNormalTriangle = doubleBorderFactory.createTriangle();
        doubleBorderNormalTriangle.draw();

        Traingle singleBorderTriangle = singleBorderFactory.createTriangle();
        singleBorderTriangle.draw();

        Traingle doubleBorderNormalTriangle2 = doubleBorderFactory.createTriangle();
        doubleBorderNormalTriangle2.draw();
     
   }
}