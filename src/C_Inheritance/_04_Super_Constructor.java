package C_Inheritance;
///  Super()
/*

super() is a constructor invocation that calls a constructor of the direct superclass.
 */

    // Parent Class
class Animal1 {
    Animal1(){
        System.out.println("Animal1");
    }
}

  // Child Class
 class Dog1 extends Animal1{
    Dog1(){
        super(); // calls Animal() - Here, super() explicitly makes the call visible.
        System.out.println("Dog1");
    }
  }

  // super() does not copy properties from the parent. It invokes a superclass constructor to initialize the superclass portion of the object.


public class _04_Super_Constructor {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        /* Output:
        Animal1
        Dog1
         */
    }
}

