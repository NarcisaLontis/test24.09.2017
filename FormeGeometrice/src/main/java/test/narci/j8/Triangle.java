package test.narci.j8;

/**
 * created by Narci on 06/09/2017 for the test
 */
public class Triangle extends ShapeObject {

    private int side1;
    private int side2;
    private int side3;

    public Triangle ( int side1, int side2, int side3 ) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getSurface ( ) {
        return  Math.sqrt((side1 + side2 + side3) / 2*((side1 + side2 + side3) / 2-side1)*((side1 + side2 + side3) / 2-side2)*((side1 + side2 + side3) / 2-side3));

    }

    public double getPerimeter ( ) {
        return (side1 + side2 + side3) / 2;
    }
}




