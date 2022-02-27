import java.util.ArrayList;

public class Traveller {
    private String name;
    private int age;
    private String cityOfOrigin;
    private String countryOfOrigin;
    private String destination;
    private double payment;

    public Traveller(String name, int age, String cityOfOrigin, String countryOfOrigin, String destination, double payment) {
        this.name = name;
        this.age = age;
        this.cityOfOrigin = cityOfOrigin;
        this.countryOfOrigin = countryOfOrigin;
        this.destination = destination;
        this.payment = payment;
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

    public String getCityOfOrigin() {
        return cityOfOrigin;
    }

    public void setCityOfOrigin(String cityOfOrigin) {
        this.cityOfOrigin = cityOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public static void getAnalyticAllInfo(ArrayList<Traveller> travellersList,int index){

        Traveller traveller=travellersList.get(index); //temp Traveller Object

        System.out.println("Name"+traveller.getName());
        System.out.println("Age"+traveller.getAge());
        System.out.println("City"+traveller.getCityOfOrigin());
        System.out.println("Payment"+traveller.getPayment());
    }
    public static void calculateTotalIncome(ArrayList<Traveller> userList){
        //calculate total income from all users
        double sum=0;
        for (Traveller tr: userList){
            sum+=tr.getPayment();
        }
        System.out.println("Total income is:"+sum);
    }

}
