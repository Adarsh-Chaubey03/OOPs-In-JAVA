package adarsh.F_Keywords.Final;

/// 'FINAL' KEYWORD -
/*
- To declare a constant
- to prevent overriding
- to prevent inheritance
 */
class AA {
    final void meth() {
    }
}

class B extends AA {
    //   void meth(){}     //error
}


final class Ab{

}
/* // ERROR

class AAB extends Ab {
}

 */

public class FinalWithInheritance {
}
