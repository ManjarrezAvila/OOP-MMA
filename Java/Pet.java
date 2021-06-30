public class Pet {
    String species;
    String id;
    String name;
    String size;
    String color;
    String age;

    public Pet(String species){
        this.species = species;

    }

    void printDataPet() {
        System.out.println("Species: " + species);
        System.out.println(" ID: " + id + " Name: " + name);
    }
}
