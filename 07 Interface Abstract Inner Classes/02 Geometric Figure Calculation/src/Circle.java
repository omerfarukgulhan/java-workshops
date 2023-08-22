
public class Circle extends Shape {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;

    }

    @Override
    public void calculateArea() {
        System.out.println(getName() + "'s area: " + (Math.PI * radius * radius));

    }

}
