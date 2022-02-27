import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Human {
    Scanner input=new Scanner(System.in);

    private String name;
    private int age;
    private ArrayList<Pet> petList;

    public Human(String name, int age, ArrayList<Pet> petList) {
        this.name = name;
        this.age = age;
        this.petList = petList;
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

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }

    public void showUserInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Now showing the Pets:");
        Iterator it =this.petList.iterator();
        while(it.hasNext()){
            Pet tmp=(Pet) it.next();
            tmp.showPetInfo();
        }
    }
    public void  addNewPet(){
        System.out.printf("Pet Name: ");
        String name=input.next();
        System.out.printf("Pet Age: ");
        int age= input.nextInt();
        System.out.printf("Pet Species: ");
        String species= input.next();
        petList.add(new Pet(name,age,this.name,species));
    }
    public void removePet(){
        System.out.println("Name of pet you want to remove?");
        String petName=input.next();
        for (Pet p:petList){
            if (p.getName().equals(petName)){
                petList.remove(p);
                return;
            }
        }
        System.out.println("Pet not found!");
    }
    public static String getUserWithMostPets( ArrayList<Human> ownerList){
        int max=ownerList.get(0).getPetList().size();
        int maxIndex=0;
        for (Human o:ownerList){
            if (o.getPetList().size()>max){
                maxIndex=ownerList.indexOf(o);
                max=o.getPetList().size();
            }
        }
        return ownerList.get(maxIndex).getName();
    }
}
