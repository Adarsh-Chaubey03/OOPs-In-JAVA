package adarsh.I_Abstract_Class.Basics;

//public class Son extends parent {}
// Error as parent is an abstract class; override implementation required

 public class Son extends Parent{

     public Son(int age){
         super(age);
     }


    @Override
    void career() {
        System.out.println("I am going to be a 4#@");
    }

    @Override
    void partner() {
        System.out.println("I like alpha ");

    }
}