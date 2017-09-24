package test.narci.j8;


class DrawingTool {

    private int shapesCount = 0;
    private ShapeObject [] shapes = new ShapeObject[10];

    public boolean addShape(ShapeObject s){
        if(containsTypeOf(s)){
            return false;
        } else {
            shapes[shapesCount++] = s;
            return true;
        }
    }

    private boolean containsTypeOf(ShapeObject s) {
        for(ShapeObject shape : shapes){
            if(shape != null && shape.getClass().equals(s.getClass())){
                return true;
            }
        }
        return false;
    }

    public float computeSurfaceOfShapes() {
        float totalSurface = 0;
        for(ShapeObject s : shapes){
            if(s!=null){
                totalSurface += s.computeSurface();
            }
        }
        return totalSurface;
    }
}