package inheritance3;

public class Circle extends Shape {
    private int radius;

    public Circle(){
        super();
        radius = 0;
    }

    public Circle(String name, String color, int radius){
        super(name, color);
        radius = 0;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print(){
        System.out.println("Radius\t\t: "+radius);
    }

}
