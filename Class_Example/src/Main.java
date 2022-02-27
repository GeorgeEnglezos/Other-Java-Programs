import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Travellers> travellersList=new ArrayList<>();
    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {
        //Dynamic useful way
        //Let's make a new Traveller
        for (int i=0;i<3;i++){
            //read input
            System.out.printf("Name:");
            String name= input.next();

            System.out.printf("Age:");
            int age= input.nextInt();

            System.out.printf("City:");
            String city= input.next();

            //make object
            Travellers newObject=new Travellers(name,age,city);

            //save object to arrayList
            travellersList.add(newObject);

        }
        //hardcoded simple way
        Travellers katerina= new Travellers("Katerina",20,"Athens");

        //Let's call printUserName()
        katerina.printUserName();
        travellersList.get(0).printUserName();

        //Print all travellers' names
        Travellers.printAllTravellers(travellersList);


    }
}
