/*
when the method is parent class is not declared as static or private or final
then such methods can be overridden in child class
and the ambiguity due to this runtime polymorphism cannot be resolved at compile time
the method being called depends on object to which the parent class reference is pointing to at runtime.
*/

class Human{
   //this method will get override
    public void walk()
    {
     System.out.println("Human walks");
    }
}

class Boy extends Human{
    public void walk()
    {
       System.out.println("Boy walks");
    }
}

class DynamicBinding {
    public static void main( String args[]) {

       Human obj1 = new Boy();
       
       Human obj2 = new Human();
       obj1.walk();
       obj2.walk();
    }
}


/*
Console output:
Boy walks
Human walks


Difference between static and dynamic binding -
1)Static binding happens at compile-time while dynamic binding happens at runtime.
2)Binding of private, static and final methods always happen at compile time since these methods cannot be overridden. When the method overriding is actually happening and the reference of parent type is assigned to the object of child class type then such binding is resolved during runtime.
3)The binding of overloaded methods is static and the binding of overridden methods(if above conditions are satisfied) is dynamic.
*/