import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Human> ownerList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            int choice=showMenu();
            System.out.println("__________________________________");
            System.out.println("Pressed "+choice);
            switch (choice) {
                case (1):
                    System.out.printf("Name: ");
                    String name = input.next();
                    System.out.printf("Age: ");
                    int age = input.nextInt();
                    ownerList.add(new Human(name, age, new ArrayList<>()));
                    break;
                case (2):
                    System.out.printf("Index of user you want to add a pet: ");
                    int index = input.nextInt();
                    while (index > ownerList.size()-1) {
                        System.out.printf("Wrong index, please try again: ");
                        index = input.nextInt();
                    }
                    ownerList.get(index).addNewPet();
                    break;
                case (3):
                    System.out.printf("Index of user you want to remove a pet: ");
                    index = input.nextInt();
                    while (index > ownerList.size()-1) {
                        System.out.printf("Wrong index, please try again: ");
                        index = input.nextInt();
                    }
                    ownerList.get(index).removePet();
                    break;
                case (4):
                    System.out.printf("Index of user you want to check info: ");
                    index = input.nextInt();
                    while (index > ownerList.size()-1) {
                        System.out.printf("Wrong index, please try again: ");
                        index = input.nextInt();
                    }
                    ownerList.get(index).showUserInfo();
                    break;
                case (5):
                    System.out.println("User with most pets is: " + Human.getUserWithMostPets(ownerList));
                    break;
            }
        }
    }

    private static int showMenu() {
        System.out.println("----------------------------------");
        System.out.println("1) Insert new Owner! " +
                "\n 2) Insert new Pet!" +
                "\n 3) Remove pet from a user! " +
                "\n 4) Show User and pets' Info! " +
                "\n 5) Show User with most pets!");
        int choice = 0;
        while (choice < 1 || choice > 5) {
            System.out.printf("Choose:");
            choice = input.nextInt();
        }
        return choice;
    }

}
