package Lesson_11;

public class LiveBlock {
    private String model;

    public LiveBlock(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "LiveBlock{" +
                "model='" + model + '\'' +
                '}';
    }
}

