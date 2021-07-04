package homework11composition;

public class MotherBoard extends Device {
    private CPU cpu;
    private RAM ram;

    public MotherBoard(String brand, String model, CPU cpu, RAM ram) {
        super(brand, model);
        this.cpu = cpu;
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
