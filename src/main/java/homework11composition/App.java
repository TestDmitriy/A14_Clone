package homework11composition;

//  Finish Computer
//  Create 2 instances of computer
//  get CPU model from computer

public class App {
    public static void main(String[] args) {
        int[] boxSize = {547,240,475};

        // 1. Device - parent class for all classes
        System.out.println("1. get CPU model from computer");
        Box box = new Box("Fractal Design","Define 7",Colors.GRAY,boxSize);
        CPU cpu = new CPU("Intel","11700K",3.6);
        RAM ram = new RAM("Corsair","DOMINATOR® PLATINUM RGB",64);
        Disk disk = new Disk("Samsung","980 Pro",2,DiskType.M2);
        GPU gpu = new GPU("Nvidia","RTX 3080 Ti",true);
        Keyboard keyboard = new Keyboard("Logitec","MX Keys",Colors.GRAY,true);
        Mouse mouse = new Mouse("Logitec","MX Master 3",Colors.GRAY,true);
        Monitor monitor1 = new Monitor("Lenovo","ThinkVision P27h-20",Colors.BLACK,27,ScreenType.IPS);
        Monitor monitor2 = new Monitor("LG","32EP950",Colors.BLACK,32,ScreenType.OLED);
        Monitor[] monitors = {monitor1,monitor2};
        PowerSupply powerSupply = new PowerSupply("Corsair","1000W Gold",1000);
        MotherBoard motherBoard = new MotherBoard("Asus","ROG Maximus XIII Hero",cpu,ram);
        SystemBlock systemBlock = new SystemBlock(powerSupply,box,gpu,disk,motherBoard);

        Computer simpleComp = new Computer(keyboard,mouse,monitors,systemBlock);

        String cpuBrand = simpleComp.getSystemBlock().getMb().getCpu().getBrand();
        String cpuModel = simpleComp.getSystemBlock().getMb().getCpu().getModel();
        System.out.println("CPU model from the computer is "+cpuBrand+" "+cpuModel);

//        Additional tasks
    }
}
