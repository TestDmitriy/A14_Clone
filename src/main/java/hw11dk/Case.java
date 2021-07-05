package hw11dk;

public class Case {
    private Brands case_brand;  //ENUM
    private String case_model;
    private Colors case_color;  //ENUM


    public Case(Brands case_brand, String case_model, Colors case_color) {
        this.case_brand = case_brand;
        this.case_model = case_model;
        this.case_color = case_color;
    }

    @Override
    public String toString() {
        return "Case{" +
                "case_brand=" + case_brand +
                ", case_model='" + case_model + '\'' +
                ", case_color=" + case_color +
                '}';
    }

    public Brands getCase_brand() {
        return case_brand;
    }

    public void setCase_brand(Brands case_brand) {
        this.case_brand = case_brand;
    }

    public String getCase_model() {
        return case_model;
    }

    public void setCase_model(String case_model) {
        this.case_model = case_model;
    }

    public Colors getCase_color() {
        return case_color;
    }

    public void setCase_color(Colors case_color) {
        this.case_color = case_color;
    }
}
