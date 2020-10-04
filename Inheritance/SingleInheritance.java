/*
	SINGLE INHERITANCE
	
	Parent
	  |
	Child
*/


class Parent{
	public void methodA(){
		System.out.println("This is from Parent Class");
	}
}

class Child extends Parent{
	public void methodB(){
		System.out.println("This is from Child Class");
	}
}

class SingleInheritance {
	public static void main(String args[]){
		Parent p = new Parent();
		Child c = new Child();

		p.methodA();
		c.methodB();

		c.methodA();
	}
}