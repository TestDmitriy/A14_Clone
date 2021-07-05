package hw11dk;

public class App {
    public static void main(String[] args) {

// HOME TASK#: Finish Computer -> Create 2 instances of computer -> get CPU model from computer

// creating 1st instance:
        //MOUSE +
        Mouse test_mouse = new Mouse(Brands.APPLE, Conectype.WIRELESS, "Apl-01");
        //Keyboard
        Keyboard test_keyboard = new Keyboard(Brands.CORSAIR,"K-65RGB",Conectype.WIRELESS);
        //Monitors[] - 2
        Monitor test_monitor1  = new Monitor(Brands.BENQ,"EX3415R",Montypes.IPS,Sizemon.IN_34);
        Monitor test_monitor2 = new Monitor(Brands.DELL, "P2719H",Montypes.LCD,Sizemon.IN_27);
        Monitor[] test_allmonitors = {test_monitor1,test_monitor2};                                         // all_monitors
        //Case
        Case test_case = new Case(Brands.PHANTEKS, "Evolv X", Colors.BLACK);
        //PSU
        PowerSupply test_psu = new PowerSupply(Brands.CORSAIR,"AX1200i",Psuformfactor.ATX_PS2,Psucables.FULLY_MODULAR,Efficiency._80_PLUS_GOLD,Voltage.W1000);
        //Mobo
        MotherBoard test_mobo = new MotherBoard(Brands.MSI,"CARBON",Moboserie.Z_GAMES_DIY,Moboformat.ATX,Socket.LGA1151);
        //Cpu
        CPU test_cpu = new CPU(Cputeam.INTEL,"i7",Socket.LGA1151);
        //Cooling
        Cooling test_cooler = new Cooling(Brands.CORSAIR,"H150i RGB",Coolingtype.AIO);
        //Ram
        RAM test_ram = new RAM(Brands.CORSAIR,"Vengeance/RGB/PRO",Ramcapacity._32GB);
        //Disk
        Disk test_disk = new Disk(Brands.WESTERN_DIGITAL,Disktype.HDD, 480);
        //videocard
        Videoadapter test_video = new Videoadapter(Brands.NVIDIA,Nvidiachipset.RTX_3090,"24G-P5-3987-KR",Coolingtype.AIR);
        //----------------------------------------------------------------------------------
        //System block
        SystemBlock test_block = new SystemBlock(test_case,test_psu,test_mobo,test_cpu,test_cooler,test_ram,test_disk,test_video);
        //Computer
        Computer test_comp1 = new Computer("Test_Build1",Comptype.WORK,test_mouse,test_keyboard, test_allmonitors,test_block);
        //------------------------------------------------------------------------------------

//HOMEWORK RESULT #1:
        System.out.println("HOMEWORK INSTANCE#2 : " +test_comp1.getSystemBlock().getCpu().getCpu_name());


// creating 2st instance:
        Mouse mouse_build2 = new Mouse(Brands.CORSAIR,Conectype.WIRELESS,"DARK CORE PRO/RGB");
        Keyboard keyboard_build2 = new Keyboard(Brands.CORSAIR,"K70 CHAMP/TKL/RGB",Conectype.WIRE);
        Monitor mon1_build2 = new Monitor(Brands.LG,"32GP850-B",Montypes.IPS,Sizemon.IN_32);
        Monitor[] mons_build2 = {mon1_build2};
        //Sysblock
        Case case_build2 = new Case(Brands.CORSAIR,"CRYSTAL 280X",Colors.WHITE);
        PowerSupply psu_build2 = new PowerSupply(Brands.CORSAIR,"RM1000X",Psuformfactor.ATX_PS2,Psucables.FULLY_MODULAR,Efficiency._80_PLUS_GOLD,Voltage.W1000);
        MotherBoard mobo_build2 = new MotherBoard(Brands.MSI, "MSI MEG Z590 ACE Gaming", Moboserie.Z_GAMES_DIY,Moboformat.ATX,Socket.LGA1200);
        CPU cpu_build2 = new CPU(Cputeam.INTEL,"i9-11900K",Socket.LGA1200);
        Cooling cool_build2 = new Cooling(Brands.CORSAIR,"H150i PRO/RGB",Coolingtype.AIR);
        RAM ram_build2 = new RAM(Brands.CORSAIR,"Dominator Platinum/RGB",Ramcapacity._64GB);
        Disk disk_build2 = new Disk(Brands.SAMSUNG,Disktype.NVME,1000);
        Videoadapter video_build2 = new Videoadapter(Brands.EVGA,Nvidiachipset.RTX_3090,"24G-P5-3987-KR",Coolingtype.AIR);

        SystemBlock sysblock2 = new SystemBlock(case_build2,psu_build2,mobo_build2,cpu_build2,cool_build2,ram_build2,disk_build2,video_build2);
        Computer pc_build2 = new Computer("ROCKET",Comptype.GAMER,mouse_build2,keyboard_build2,mons_build2,sysblock2);

        System.out.println("HOMEWORK INSTANCE#2 : " +sysblock2.getCpu().getCpu_name());
    }
}
