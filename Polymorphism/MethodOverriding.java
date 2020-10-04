/*
Method Overriding is also nown as runtime polymorphism (or dynamic polymorphism)
But Why?
Unlike method overloading here both the method name and parameter definition are same 
because of which compiler cannot resolve this ambiguity at compile time
then how is this ambiguity removed?
At the runtime the object calling the method is considered
whichever class it is referencing to at runtime that class's method will get called.
*/

class Parent {
	public void add(int a,int b){
		System.out.println("Parent says "+(a+b));
	}
} 

class Child extends Parent {
	public void add(int a,int b){
		System.out.println("Child says "+(a+b));
	}
}

class MethodOverriding {
	public static void main(String args[]){
		Parent p;			//Parent class reference of object
		
		p = new Parent();	//p is referencing to Parent class object
		p.add(4,5);

		p = new Child();	//p is referencing to Child class object
		p.add(4,5); 

		Child c;            //Parent class reference of object
		
		c = new Child();
		c.add(3,4);			//c is referencing to Child class object

		// This is not allowed
		// c = new Parent();
	}
}

/*
 error: incompatible types: Parent cannot be converted to Child
 */

/*
Console output:
Parent says 9
Child says 9
Child says 7
*/