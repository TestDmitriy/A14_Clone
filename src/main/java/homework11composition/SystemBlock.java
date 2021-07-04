package homework11composition;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Box box;
    private GPU gpu;
    private Disk disk;
    private MotherBoard mb;

    public SystemBlock(PowerSupply powerSupply, Box box, GPU gpu, Disk disk, MotherBoard mb) {
        this.powerSupply = powerSupply;
        this.box = box;
        this.gpu = gpu;
        this.disk = disk;
        this.mb = mb;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public MotherBoard getMb() {
        return mb;
    }

    public void setMb(MotherBoard mb) {
        this.mb = mb;
    }
}
