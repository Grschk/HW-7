class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rhombus = new Rhombus();
        Shape ellipse = new Ellipse();
        ShapeVoid.shapeVoid(circle);
        ShapeVoid.shapeVoid(triangle);
        ShapeVoid.shapeVoid(quad);
        ShapeVoid.shapeVoid(rhombus);
        ShapeVoid.shapeVoid(ellipse);
    }

}
