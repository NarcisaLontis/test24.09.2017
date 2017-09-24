package test.narci.j8;

/**
 * created by Narci on 06/09/2017 for the test
 */

public class Circle extends ShapeObject {
    private double radius;

    public Circle ( double r ) {
        this.radius = r;
    }


    public double getSurface ( ) {
        return (double) (Math.PI * this.radius * this.radius);
    }

    public double getPerimeter ( ) {
        return (double) (2.0 * Math.PI * this.radius);
    }
}

    double getSurface() {
        return Math.PI * getRadius() * getRadius();
    }
