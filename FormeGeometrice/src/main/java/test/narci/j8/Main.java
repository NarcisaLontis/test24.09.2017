package test.narci.j8;

/**
 * created by Narci on 06/09/2017 for the test
 */

public class Main {


    public static void main ( String[] args ) {
        Rectangle r = new Rectangle ( 0, 0, 100, 200 );
        System.out.println ( "rectangle surface : " + r.getSurface () );
        System.out.println ( "rectangle perimeter : " + r.getPerimeter () );

        Rectangle square = new Rectangle ( 0, 0, 10, 10 );
        System.out.println ( "square surface: " + square.getSurface () );
        System.out.println ( "square perimeter github: " + square.getPerimeter () );


        Circle c = new Circle ( 5 );
        System.out.println ( "circle surface: " + c.getSurface () );
        System.out.println ( "circle perimeter: " + c.getPerimeter () );

        Triangle t = new Triangle ( 3, 4, 5 );
        System.out.println ( "triangle surface: " + t.getSurface () );
        System.out.println ( "triangle perimeter: " + t.getPerimeter () );


        ShapeObject[] shapeObjects = new ShapeObject[ 4 ];
        shapeObjects[ 0 ] = new Rectangle ( 0, 0, 2, 3 );
        shapeObjects[ 1 ] = new Square ( 1, 1, 5 );
        shapeObjects[ 2 ] = new Circle ( 5 );
        shapeObjects[ 3 ] = new Triangle ( 3, 4, 5 );


        for (ShapeObject go : shapeObjects) {
            System.out.println ( go.getSurface () );
            System.out.println ( go.getPerimeter () );
        }

    }

}


