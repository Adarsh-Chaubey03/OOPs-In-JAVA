package adarsh.J_Access_Control.Basics;

/*

Target -  Access the data member and modify them

_________________________________________________________________________________________
|             | Class | Package | Subclass    | Subclass    | World                     |
|             |       |         | (same pkg)  | (diff pkg)  | diff pkg & not subclass   |
-----------------------------------------------------------------------------------------
| public      |   +   |    +    |      +      |      +      |             +             |
-----------------------------------------------------------------------------------------
| protected   |   +   |    +    |      +      |      +      |                           |
-----------------------------------------------------------------------------------------
| default     |   +   |    +    |      +      |             |                           |
-----------------------------------------------------------------------------------------
| private     |   +   |    +    |             |             |                           |
-----------------------------------------------------------------------------------------


 */
public class Main {
    public static void main(String[] args) {
        A obj = new A(23,"adarsh");

//  PRIVATE

     // obj.num; => can't access as int num is private
        // method to access it
        int x = obj.getNum();
        System.out.println(x); //23

    }
}
