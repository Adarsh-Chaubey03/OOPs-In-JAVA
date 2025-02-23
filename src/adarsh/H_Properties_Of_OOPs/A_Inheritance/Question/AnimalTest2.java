package adarsh.H_Properties_Of_OOPs.A_Inheritance.Question;

/*

MULTILEVEL INHERITANCE:
----------------------

            Super Class : A <- B <- C
                      (subclasses: B and C)

 */


class Animal1 {
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

class Dog1 extends Animal1 {
    public String breed;

    void displayInfo() {
        System.out.println("Species: " + getSpecies());
        System.out.println("Habitat: " + habitat);
        System.out.println("Breed: " + breed);
    }
}

class Mammal extends Dog1 {
    void breathe() {
        System.out.println("Mammal breathes");
    }
}

public class AnimalTest2 {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.breed = "Husky";
        m.sound = "Bark";
        m.habitat = "Domestic";
        m.setSpecies("Canis lupus");

        System.out.println("Sound: " + m.sound);
        System.out.println("Breed: " + m.breed);
        m.breathe();
    }
}
