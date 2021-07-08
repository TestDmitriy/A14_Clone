package hw12dk;

public class Liquid extends Fans implements Cooling{
    private String liqstr;
    private String comb;

    @Override
    public void AirBlow() {
        System.out.println("LIQUID: liquid cooling");
    }


    @Override
    public void CoolingInterfaces() {
        System.out.println(liqstr);
    }


    public Liquid(String fanstr, String liqstr) {
        super(fanstr);
        this.liqstr = liqstr;
    }

//    public Liquid(String liqstr) {
//        this.liqstr = liqstr;
//    }

    public String getLiqstr() {
        return liqstr;
    }

    public void setLiqstr(String liqstr) {
        this.liqstr = liqstr;
    }
}
