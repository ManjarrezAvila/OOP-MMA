class Main {
    public static void main (String[] args){
        System.out.println("Hola Mundo");
        Pet dog = new Pet("dog", 3258, "Firulais");
        dog.size = "small";
        dog.color = "white";
        dog.age = 4;
        dog.printDataPet();

        Pet lilcat = new Pet("cat", 2645, "Olly");
        lilcat.size = "extra small";
        lilcat.color = "black";
        lilcat.age = 1;
        lilcat.printDataPet();

        
    }
}