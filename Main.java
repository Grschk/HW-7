class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("This is " + circle.printName() + " , angles count is " +circle.countAngles());
        Shape quad = new Quad();
        System.out.println("This is " + quad.printName() + " , angles count is " +quad.countAngles());
        Shape triangle = new Triangle();
        System.out.println("This is " + triangle.printName() + " , angles count is " +triangle.countAngles());
        Shape rhombus = new Rhombus();
        System.out.println("This is " + rhombus.printName() + " , angles count is " +rhombus.countAngles());
        Shape ellipse = new Ellipse();
        System.out.println("This is " + ellipse.printName() + " , angles count is " +ellipse.countAngles());
    }
}
