package encap;

public class employee {

    private String name;
    private String surname;
    private int age;



    public void set_name(String n) {
        this.name=n;

    }

    public void  set_surname(String n1) {
        this.surname=n1;
    }

    public void set_age(int n2) {
        this.age=n2;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public int get_age(int n2) {
        return age;


    }
    public void showprintdetails(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSurname());
    }

}