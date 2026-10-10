package C_Inheritance;
// Types of Inheritance
/*
Single inheritance
One child inherits from one parent.
Animal → Dog

Multilevel inheritance
A child becomes the parent of another class.
Animal → Mammal → Dog

Hierarchical inheritance
Multiple child classes inherit from the same parent.
Animal → Dog, Cat

Multiple inheritance
One child inherits from multiple parents. Java does not support this with classes, but a class can implement multiple interfaces.

Hybrid inheritance combines inheritance structures. Java can represent some hybrid structures using interfaces,
but not unrestricted multiple class inheritance.
 */
public class _02_Inheritance_Types {
}


/// Important Points
/*
Can a Java class extend multiple classes?	No
Can a class implement multiple interfaces?	Yes
Are constructors inherited?	No
Are private methods directly accessible in a child?	No
Does keyword 'extends' automatically override methods?	No
Can inheritance enable runtime polymorphism?	Yes
*/
