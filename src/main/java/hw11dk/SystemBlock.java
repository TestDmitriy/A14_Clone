package hw11dk;

public class SystemBlock {
    private Case pc_case;                   // +
    private PowerSupply powerSupply;        // +

    private MotherBoard mobo;               // +
    private CPU cpu;                        // +
    private Cooling cooling;                // +
    private RAM ram;                        // +
    private Disk disk;                      // +
    private Videoadapter videoadapter;      // +


//Constructor

    public SystemBlock(Case pc_case, PowerSupply powerSupply, MotherBoard mobo, CPU cpu, Cooling cooling, RAM ram, Disk disk, Videoadapter videoadapter) {
        this.pc_case = pc_case;
        this.powerSupply = powerSupply;
        this.mobo = mobo;
        this.cpu = cpu;
        this.cooling = cooling;
        this.ram = ram;
        this.disk = disk;
        this.videoadapter = videoadapter;
    }

//toString
    @Override
    public String toString() {
        return "SystemBlock: " +
                "pc_case = " + pc_case +
                ", powerSupply = " + powerSupply +
                ", mobo = " + mobo +
                ", cpu = " + cpu +
                ", cooling = " + cooling +
                ", ram = " + ram +
                ", disk = " + disk +
                ", videoadapter = " + videoadapter +
                '}';
    }

//getters&setters
    public Case getPc_case() {
        return pc_case;
    }

    public void setPc_case(Case pc_case) {
        this.pc_case = pc_case;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public MotherBoard getMobo() {
        return mobo;
    }

    public void setMobo(MotherBoard mobo) {
        this.mobo = mobo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Videoadapter getVideoadapter() {
        return videoadapter;
    }

    public void setVideoadapter(Videoadapter videoadapter) {
        this.videoadapter = videoadapter;
    }
}
