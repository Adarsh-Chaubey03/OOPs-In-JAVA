package adarsh.F_Keywords.Static;
public class _1_StaticKeyword {

    public static void main(String[] args) {
        Human beta = new Human(22, "alpha", 18878, false);
        Human alpha = new Human(22, "beta", 12878, false);
        System.out.println(Human.population); //2
    }
}

class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population; // which is same for everyone

    static void message() {
        System.out.println("hii");
        // System.out.println(this.age);  Can't use 'this' keyword inside static methods
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
// static variable are independent of object
// static belongs to class not object
// something which is not static belongs to object
// You cannot access non-static stuffs without referencing their instances in a static context
