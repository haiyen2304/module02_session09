package EX01;

public class Main {
    public static void main(String[] args) {
////Kiểm thử Class Shape
//        System.out.println("-------- - SHAPE----------");
//
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//
////kiểm thử Class Circle
//        System.out.println("-------- - CIRCLE----------");
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
////Kiểm thử RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
////Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//
//        Square square = new Square();
//        System.out.println(square);
//
//        square = new Square(2.3);
//        System.out.println(square);
//
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);



        // Chương trình chay :
        //BƯỚC 1: tạo mảng.
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Square(5);
        for (int i = 0; i < shapes.length; i++) {
            //			if (shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square){....
            if(shapes[i] instanceof Circle){
                System.out.println("Trước khi thay đổi = " + ((Circle) shapes[i]).getArea());
                double randomNumber = Math.floor(Math.random() * 100);

                System.out.println("Phần trăm thay đổi = " + randomNumber);
                // kiểm tra hình thứ i trien khai cua Resizeable
                if (shapes[i] instanceof Resizeable)
                {
                    ((Resizeable) shapes[i]).resize(randomNumber);
                }

                System.out.println("Sau khi thay đổi = " + ((Circle) shapes[i]).getArea());
            }



            if(shapes[i] instanceof Rectangle){
                System.out.println("Trước khi thay đổi = " + ((Rectangle) shapes[i]).getArea());
                double randomNumber = Math.floor(Math.random() * 100);

                System.out.println("Phần trăm thay đổi = " + randomNumber);
                // kiểm tra hình thứ i trien khai cua Resizeable
                if (shapes[i] instanceof Resizeable)
                {
                    ((Resizeable) shapes[i]).resize(randomNumber);
                }

                System.out.println("Sau khi thay đổi = " + ((Rectangle) shapes[i]).getArea());
            }



            if(shapes[i] instanceof Square){
                System.out.println("Trước khi thay đổi = " +  ((Square) shapes[i]).getArea());
                double randomNumber = Math.floor(Math.random() * 100);

                System.out.println("Phần trăm thay đổi = " + randomNumber);
                // kiểm tra hình thứ i trien khai cua Resizeable
                if (shapes[i] instanceof Resizeable)
                {
                    ((Resizeable) shapes[i]).resize(randomNumber);
                }

                System.out.println("Sau khi thay đổi = " + ((Square) shapes[i]).getArea());
            }
        }

    }
}