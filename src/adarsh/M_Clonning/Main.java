package adarsh.M_Clonning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(23, "aa");
        //  Human h2 = new Human(h1); => it is taking a lot of time in compiling
        Human h2 = (Human) h1.clone();
        System.out.println(h2.age);
        System.out.println(h2.name);

    }
}
