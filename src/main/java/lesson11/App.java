package lesson11;

public class App {
    public static void main(String[] args) {

        Address annaAddress = new Address("123 Elm st","Gotham",State.FL,33365);
        Person anna = new Person("Anna","Wilson",1999,annaAddress);

//        String streetAddr = anna.getAddress().getStreetAddress1();
        Address addr = anna.getAddress();
        String streetAddr = addr.getStreetAddress1();
        System.out.println(streetAddr);

        Engine engine = new Engine("XX-super");
        LiveBlock liveBlock = new LiveBlock("LB-1");
        Person[]crew ={anna};
        Shuttle shuttle = new Shuttle(engine,liveBlock,crew);

        streetAddr = shuttle.getCrew()[0].getAddress().getStreetAddress1();
//        Person[] cr = shuttle.getCrew();
//        Person member = cr[0];
//        addr = member.getAddress();
//        streetAddr = addr.getStreetAddress1();
        System.out.println(shuttle.getCrew()[0].getAddress().getStreetAddress1());



    }
}
