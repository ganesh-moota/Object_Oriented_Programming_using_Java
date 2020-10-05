/*
	MULTIPLE INHERITANCE
	
	Parent1		Parent2
	   |		  |
	   ----------------
		  |
		Child
*/


class Parent1{
	public void methodA(){
		System.out.println("This is from Parent1 Class");
	}
}

class Parent2{
	public void methodB(){
		System.out.println("This is from Parent2 Class");
	}
}

// Java and C# does not support Multiple Inheritance
// Multiple Inheritance is supported in C++
// Note: We can implment it using interfaces
// Hybrid Inheritance is a combination of any of these inheritances types.

class Child extends parentA,parentB{
	public void methodC(){
		System.out.println("This is not allowed!!");
	}
}

class MultipleInheritance {
	public static void main(String args[]){
		Parent1 p1 = new Parent1();
		Parent2 p2 = new Parent2();

		Child c = new Child();
	}
}



/*
Console output:
MultipleInheritance.java:24: error: '{' expected
class Child extends parentA,parentB{
                           ^
1 error
*/
