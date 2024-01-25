public class Main {
    public static void main(String[] args) {
        SingletonShape singletonShape = SingletonShape.getSingle();
        Shape shape1 = singletonShape.getShape("CIRCLE");

        if (shape1 != null) {
            shape1.draw();
        } else {
            System.out.println("This type is null");
        }

        Shape shape2 = singletonShape.getShape("RECTANGLE");
        if (shape2 != null) {
            shape2.draw();
        } else {
            System.out.println("null type");
        }

    }

}