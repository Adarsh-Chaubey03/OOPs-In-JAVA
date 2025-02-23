package adarsh.H_Properties_Of_OOPs.A_Inheritance.Question;

/*

 HIERARCHICAL INHERITANCE:
 -------------------------
           A
           │
      ┌────┴────┐
      B         C



  - A → Parent class (Animal2)
  - B, C→ Child classes (Dog2, Cat2)

*/

class Animal2 {
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

class Dog2 extends Animal2 {
    public String breed;

    void displayInfo() {
        System.out.println("Species: " + getSpecies());
        System.out.println("Habitat: " + habitat);
        System.out.println("Breed: " + breed);
    }
}

class Cat2 extends Animal2 {
    public String color;

    void displayInfo() {
        System.out.println("Species: " + getSpecies());
        System.out.println("Habitat: " + habitat);
        System.out.println("Color: " + color);
    }
}

public class AnimalTest3 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.breed = "Husky";
        d.sound = "Bark";
        d.habitat = "Domestic";
        d.setSpecies("Canis lupus");

        System.out.println("Dog Sound: " + d.sound);
        System.out.println("Dog Breed: " + d.breed);
        d.displayInfo();

        Cat2 c = new Cat2();
        c.color = "White";
        c.sound = "Meow";
        c.habitat = "Domestic";
        c.setSpecies("Felis catus");

        System.out.println("Cat Sound: " + c.sound);
        System.out.println("Cat Color: " + c.color);
        c.displayInfo();
    }
}
