/*	
	MULTI LEVEL INHERITANCE
	
	Parent
	  |
	Parent
	  |
	Child
*/

class Parent1 {
	public void methodA(){
		System.out.println("This is from Parent1 class");
	}
}

class Parent2 extends Parent1 {
	public void methodB(){
		System.out.println("This is from Parent2 class");
	}
}

class Child extends Parent2 {
	public void methodC(){
		System.out.println("This is from Child class");
	}
}

class MultiLevelInheritance {
	public static void main(String args[]){
		Parent1 p1 = new Parent1();
		Parent2 p2 = new Parent2();
		Child c = new Child();

		p1.methodA();

		p2.methodB();
		p2.methodA();

		c.methodC();
		c.methodB();
		c.methodA();

	}
}