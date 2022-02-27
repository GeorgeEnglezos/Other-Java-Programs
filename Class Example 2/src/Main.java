import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**Άσκηση 8- ArrayList-Classes:
     Θέλουμε να φτιάξουμε μια εφαρμογή που να να παίρνει τα στοιχεία ταξιδιωτών και να τα αποθηκεύει σε μια λίστα.
     Ζητούμενα:

     γ)Υπολογισμός συνολικών εσόδων και εκτύπωση

     v) Στην περίπτωση που επιλέξει "Υπολογισμός συνολικών εσόδων και εκτύπωση" (γ) θα καλούμε την μέθοδο
     CalculateTotalIncome() που θα υπάρχει μέσα στην κλάση Traveller. Η μέθοδος αυτή θα υπολογίζει το άθροισμα
     του ποσού πληρωμής από όλους τους χρήστες και θα το εκτυπώνει.
     *
     */
    static Scanner input =new Scanner(System.in);
    static ArrayList<Traveller> travellersList=new ArrayList<>();
    public static void main(String[] args) {

        while(true) {
            int option;
            do {
                System.out.println("1 : Enter new user. ");
                System.out.println("2 : Print user details. ");
                System.out.println("3 : Calculation and printing of total revenue. ");
                System.out.println("Give option [1-3]: ");

                option = input.nextInt();
            } while (option < 0 && option > 3);

            switch (option) {
                case 1:
                    travellersList.add(insertNewUser());
                    break;
                case 2:
                    //Print User
                    System.out.println("Give position:");
                    int userIndex=input.nextInt();
                    Traveller.getAnalyticAllInfo(travellersList,userIndex);
                    break;
                default:
                    //Calculate total income
                    Traveller.calculateTotalIncome(travellersList);
            }

        }
    }

    //returns Object
    private static Traveller insertNewUser(){
        System.out.println("Give username: ");
        String name = input.next();

        System.out.println("Give age: ");
        int age = input.nextInt();

        System.out.println("Give city of origin: ");
        String cityOfOrigin = input.next();

        System.out.println("Give country of origin: ");
        String countryOfOrigin = input.next();

        System.out.println("Give destination: ");
        String destination = input.next();

        System.out.println("Give payment: ");
        double payment = input.nextDouble();

        Traveller newUser=new Traveller(name,age,cityOfOrigin,countryOfOrigin,destination,payment);

        return newUser;
    }
}
