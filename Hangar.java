public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("Clio",50);
        clio.setKilometers(20);
        Boat Titanic = new Boat("Titanic",20);

        System.out.println(clio.doStuff());
        System.out.println(Titanic.doStuff());
    }
}