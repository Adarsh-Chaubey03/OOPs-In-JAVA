package adarsh.I_Abstract_Class.Basics;

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }

    static void hello() {
        System.out.println("hey");
    }


    abstract void career();
    abstract void partner();

}
