package adarsh.I_Abstract_Class.Basics;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(23);
        daughter.career();

        Parent.hello();
        /*
          Parent mom = new Parent(); => Error
          - not possible to create object of abstract class directly without overriding
          - it can be created like:

        Parent mom = new Parent() {
            @Override
            void career() {
            }

            @Override
            void partner() {
            }
        }
         */

    }
}
