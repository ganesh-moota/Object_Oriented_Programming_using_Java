/*
	HIERARCHICAL INHERITANCE

		Parent1
		   |
  ---------------------------------
  |		   |	   	  |
Child1		Child2		Child3

*/

class Parent {
	public void methodA(){
		System.out.println("This is from Parent Class");
	}
}

class Child1 extends Parent {
	public void methodC1(){
		System.out.println("This is from Child1 Class");
	}
}

class Child2 extends Parent {
	public void methodC2(){
		System.out.println("This is from Child2 Class");
	}
}

class Child3 extends Parent {
	public void methodC3(){
		System.out.println("This is from Child3 Class");
	}
}

class HierarchicalInheritance {
	public static void main(String args[]){
		Parent p = new Parent();
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();

		p.methodA();

		c1.methodC1();
		c1.methodA();

		c2.methodC2();
		c2.methodA();

		c3.methodC3();
		c3.methodA();

		
	}
}


