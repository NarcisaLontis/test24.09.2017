package test.narci.j8;

/**
 * created by Narci on 06/09/2017 for the test
 */
public class Rectangle extends ShapeObject {
    private int posX;
    private int posY;
    private int width;
    private int height;

    public Rectangle ( int posX, int posY, int width, int height ) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }

    public int getPosX ( ) {
        return posX;
    }

    public int getPosY ( ) {
        return posY;
    }

    public int getWidth ( ) {
        return width;
    }

    public int getHeight ( ) {
        return height;
    }

    @Override
    public double getSurface ( ) {
        return width * height;
    }

    public double getPerimeter ( ) {
        return 2 * width + 2 * height;
    }
}

