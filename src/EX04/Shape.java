package EX04;

public abstract class Shape {
    private String color;
    //construtor
    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void display(){
        System.out.println("Color: " + color);
    }
    public abstract double getArea();
}
