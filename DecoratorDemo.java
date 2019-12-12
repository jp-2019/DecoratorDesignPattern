public class DecoratorDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        c.draw();
        redCircle.draw();
    }
}
