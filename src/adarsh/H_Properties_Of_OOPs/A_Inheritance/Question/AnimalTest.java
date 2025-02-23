package adarsh.H_Properties_Of_OOPs.A_Inheritance.Question;

class Animal {
    private String species;
    public String sound;
    String habitat;

    void setSpecies(String S) {
        species = String.valueOf(S);
    }

    String getSpecies() {
        return species;
    }
}

class Dog extends Animal {
    public String breed;

    void displayInfo() {
        System.out.println("Species: " + getSpecies());
        System.out.println("Habitat: " + habitat);
        System.out.println("Breed: " + breed);
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.breed = "Husky";
        d.sound = "Bark";
        d.habitat = "Domestic";
        d.setSpecies("Canis lupus");
        d.displayInfo();
    }
}
