package abstraction;

public class Scooters extends Vehicles  {

public void type(){

    System.out.println("Activa");
    System.out.println("Access");
}

    @Override
    public void colours() {

        System.out.println("red");
        System.out.println("blue");


    }

    public static void main(String[] args) {
        Scooters S=new Scooters();
        S.type();
        S.colours();
        S.types();
    }
}
