package homework10inheritance;

public class Smartphone extends SmartDevice {
    private OS os;

    public Smartphone(String make, String model, Colors color, Processors processor, OS os) {
        super(make, model, color, processor);
        this.os = os;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Smartphone " + make +
                " " + model +
                ", color=" + color +
                ", processor=" + processor +
                ", os=" + os;
    }
}
