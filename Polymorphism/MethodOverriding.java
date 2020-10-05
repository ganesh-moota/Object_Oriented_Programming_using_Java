/*
Method Overriding is also known as runtime polymorphism (or dynamic polymorphism)
But Why?
Unlike method overloading here both the method name and parameter definition are same 
because of which compiler cannot resolve this ambiguity at compile time
then how is this ambiguity resolved?
the method to be called is decided by the class which is being pointed by parent reference
if parent ref is pointing to parent object then method from parent class will be called
if parent ref is pointing to child object then method from child class will be called
-> to which class a reference is pointing cannot be determined at compile time as it happens at runtime only.

Note:Also see data binding to know some exceptional cases
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
		Parent p;			//Parent class reference 
		
		p = new Parent();		//p is referencing to Parent class object
		p.add(4,5);

		p = new Child();		//p is referencing to Child class object
		p.add(4,5); 

		Child c;            		//Child class reference 
		
		c = new Child();		//c is referencing to Child class object
		c.add(3,4);			

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
