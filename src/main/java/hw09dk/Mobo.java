package hw09dk;

public class Mobo {
    // Class fields-description

    private String brand;
    private String name;
    private String formation;
    private int price;
    private String buyer;


    // Default Constructor
    public Mobo() {
    }

    // Class Constructor - Dedicated fields
    public Mobo(String brand, String name, String formation, int
                price, String buyer) {
        this.brand = brand;
        this.name = name;
        this.formation = formation;
        this.price = price;
        this.buyer = buyer;
    }

// ---------------------------------------- setters
        public void setBrand (String brand){
            this.brand = brand;
        }
        public void setName (String name){
            this.name = name;
        }
        public void setFormation (String formation){
            this.formation = formation;
        }
        public void setPrice (int price){
            if (price <=0){
                System.out.println("wrong price, should be bigger than - 0");
            }
            this.price = price;
        }
        public void setBuyer (String buyer){
            this.buyer = buyer;
        }

// ----------------------------------------- getters

        public String getBrand(){
            return brand;
        }
        public String getName(){
            return name;
        }
        public String getFormation(){
            return formation;
        }
        public int getPrice(){
            return  price;
        }
        public String getBuyer(){
            return buyer;
        }

// -------------------------------------- printClass/Info Methods

    public void printClass() {
        System.out.println(getBuyer() + " :  " + getPrice() + " :  " + getBrand() + " :  " + getName() + " :  " + getFormation());
    }

    public void setOwner(String buyer, int price) {
        System.out.println(buyer + " : " + price);
    }

}
