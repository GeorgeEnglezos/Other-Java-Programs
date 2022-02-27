import java.util.ArrayList;

public class Travellers {
    private String name;
    private int age;
    private String city;

    //constructor
    public Travellers(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    //Will remain for every Objec

    //Not static example

    /**
     * Doesn't need parameters, because it can see the variables above from the same object
     */
    public void printUserName(){
        System.out.println(this.getName());
    }

    /**
     * @param travellers a list with every traveller
     */
    public static void printAllTravellers(ArrayList<Travellers> travellers){
        for(Travellers tr: travellers){
            System.out.println(tr.getName());
        }
    }

    public static void randomMethod(String Name, int age, String city){
        System.out.println(Name+" "+age);

    }
}
