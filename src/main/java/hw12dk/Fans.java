package hw12dk;

public class Fans implements Cooling, Air{
    private String fanstr;

    @Override
    public void AirBlow() {
        System.out.println("FANS : Pull/Push AIR ");
    }

    @Override
    public void CoolingInterfaces(){
        System.out.println(fanstr);
    }


    public Fans(String fanstr) {
        this.fanstr = fanstr;
    }

    public String getFanstr() {
        return fanstr;
    }

    public void setFanstr(String fanstr) {
        this.fanstr = fanstr;
    }
}
