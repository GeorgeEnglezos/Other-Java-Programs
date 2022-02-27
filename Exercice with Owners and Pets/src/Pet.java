public class Pet {
    String name;
    int age;
    String ownerName;
    String species;

    public Pet(String name, int age, String ownerName, String species) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.species = species;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void showPetInfo(){
        System.out.println("-----------------------");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Owner Name:"+this.ownerName);
        System.out.println("Species:"+this.species);
    }
}
