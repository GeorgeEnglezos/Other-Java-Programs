import java.util.Scanner;

public class Pizza {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int pizza=12;
        while(pizza>0){ //pizza!=0
            System.out.println("Posa thes: ");
            int slices=input.nextInt();
            pizza-=slices;
            System.out.println("Menoun: "+ pizza);
        }
        System.out.println("teleiwse");
    }

}
