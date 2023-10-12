package abstraction;

public class rooms extends Hotels {
    public void floor(){
        System.out.println("there are 2 floors containing rooms");
        System.out.println("the third floor is a partyhall");
    }

    @Override
    public void roomRent() {
        System.out.println("the AC=rs5000");
        System.out.println("non AC=rs 3000");
        System.out.println("Normal=rs 1000");


    }

    public static void main(String[] args) {
        rooms r=new rooms();
        r.roomType();
        r.floor();
        r.roomRent();
    }
}
