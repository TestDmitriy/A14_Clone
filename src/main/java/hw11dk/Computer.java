package hw11dk;

import java.util.Arrays;

public class Computer {
    private String name;

    private Comptype comptype;               // ENUM : COMPTYPE

    private Mouse mouse;                     // +
    private Keyboard keyboard;               // +
    private Monitor[] monitors;               // +

    private SystemBlock systemBlock;         // +


    //constructor


    public Computer(String name, Comptype comptype, Mouse mouse, Keyboard keyboard, Monitor[] monitors, SystemBlock systemBlock) {
        this.name = name;
        this.comptype = comptype;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitors = monitors;
        this.systemBlock = systemBlock;
    }

    //toString
    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", comptype=" + comptype +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", monitors=" + Arrays.toString(monitors) +
                ", systemBlock=" + systemBlock +
                '}';
    }

    //getters&setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comptype getComptype() {
        return comptype;
    }

    public void setComptype(Comptype comptype) {
        this.comptype = comptype;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor[] monitors) {
        this.monitors = monitors;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }
}
