package homework10inheritance;

public class SmartDevice extends Device {
    protected Processors processor;

    public SmartDevice(String make, String model, Colors color, Processors processor) {
        super(make,model,color);
        this.processor = processor;
    }

    public SmartDevice(String make, String model, Colors color) {
        super(make,model,color);
    }

    public Processors getProcessor() {
        return processor;
    }

    public void setProcessor(Processors processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "SmartDevice " + make +
                " " + model +
                ", color=" + color +
                ", processor=" + processor;
    }
}
