class Parrot  extends Pet{

    public Parrot(String species) {
        super(species);
    }

    void printDataPet() {
        System.out.println("Species: " + species);
        System.out.println(" ID: " + id + " Name: " + name);
        System.out.println(" Size: " + size + " Color: " + color + "Age: " + age);
    }
    
}
