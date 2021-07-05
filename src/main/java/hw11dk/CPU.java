package hw11dk;

public class CPU {
    private Cputeam cpu_team;       // Enum
    private String cpu_name;
    private Socket cpu_socket;      // ENUM


    public CPU(Cputeam cpu_team, String cpu_name, Socket cpu_socket) {
        this.cpu_team = cpu_team;
        this.cpu_name = cpu_name;
        this.cpu_socket = cpu_socket;
    }

    @Override
    public String toString() {
        return "CPU { " +
                "cpu_team = " + cpu_team +
                ", cpu_name= '" + cpu_name + '\'' +
                ", cpu_socket = '" + cpu_socket + '\'' +
                '}';
    }

    public Cputeam getCpu_team() {
        return cpu_team;
    }

    public void setCpu_team(Cputeam cpu_team) {
        this.cpu_team = cpu_team;
    }

    public String getCpu_name() {
        return cpu_name;
    }

    public void setCpu_name(String cpu_name) {
        this.cpu_name = cpu_name;
    }

    public Socket getCpu_socket() {        return cpu_socket;    }

    public void setCpu_socket(Socket cpu_socket) {        this.cpu_socket = cpu_socket;    }
}
