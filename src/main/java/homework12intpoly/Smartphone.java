package homework12intpoly;

public class Smartphone implements Screen {
    private String name;
    private double length;
    private double wight;

    public Smartphone(String name, double length, double wight) {
        this.name = name;
        this.length = length;
        this.wight = wight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public void write() {
        System.out.println(name+" smartphone has length "+length+" and wight "+wight+" inches");
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(length*length+wight*wight);
    }
}
