package EX04;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle và Circle
        Shape rectangle = new Rectangle("Red", 4.0, 5.0);
        Shape circle = new Circle("Blue", 3.0);
        // Hiển thị màu sắc và diện tích của Rectangle
        rectangle.display();
        rectangle.getArea();
        // Hiển thị màu sắc và diện tích của Circle
        circle.display();
        circle.getArea();
    }
}
