class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rhombus = new Rhombus();
        Shape ellipse = new Ellipse();
        shapeVoid(circle);
        shapeVoid(triangle);
        shapeVoid(quad);
        shapeVoid(rhombus);
        shapeVoid(ellipse);
    }
    public static void shapeVoid(Shape shape) {
        System.out.println("Shape is " + shape.printName());
        System.out.println("Angles count is " + shape.countAngles());
    }

}
