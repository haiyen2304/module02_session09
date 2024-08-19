package EX02;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Square(4.0);

        for (int i = 0; i < shapes.length; i++) {
            // nếu hình đang xét thuộc kiểu Circle, thì ép về kiểu của Circle và lấy ra diện tich.
            if (shapes[i] instanceof Circle) {
                System.out.println("Circle area: " + ((Circle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.println("Rectangle area: " + ((Rectangle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Square) {
                System.out.println("Square area: " + ((Square) shapes[i]).getArea());
            }
            // Nếu phần tử là Colorable, gọi phương thức howToColor()
            if(shapes[i] instanceof Colorable) {
                ((Colorable)shapes[i]).howToColor();
            }
            System.out.println();
        }
    }
}