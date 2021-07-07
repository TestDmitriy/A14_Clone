package homework12intpoly;

public class SmartWatch implements Screen{
    private String name;
    private double radius;

    public SmartWatch(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void write() {
        System.out.printf("%s smartwhatch has %s inches radius\n",name,radius);
    }

    @Override
    public double getDiagonal() {
        return 2*radius;
    }
}
