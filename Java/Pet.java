public class Pet {
    String pettype;
    Integer id;
    String name;
    String size;
    String color;
    Integer age;

    public Pet(String pettype, Integer id, String name){
        this.pettype = pettype;
        this.id = id;
        this.name = name;

    }

    void printDataPet() {
        System.out.println("Pet type: " + pettype + " ID: " + id + " Name: " + name);
        System.out.println("Size: " + size + " Color: " + color + " Age: " + age);
    }
}
