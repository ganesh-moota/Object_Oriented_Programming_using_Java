class A {
	public void methodA(){
		System.out.println("method A from class A");
	}
}
abstract class AbstractClass extends A {
	public void method1(){
		System.out.println("method 1 from abstract class");
	}

	abstract void method2();
}

class B extends AbstractClass {
	public void method2(){
		System.out.println("method 2 overriden in class B");
	}

	public void methodB(){
		System.out.println("method B from class B");
	}
}

class AbstractClassExample {
	public static void main(String args[]){
		B obj = new B();

		obj.methodA();
		obj.methodB();
		obj.method1();
		obj.method2();
	}
}


/*
console output:
method A from class A
method B from class B
method 1 from abstract class
method 2 overriden in class B
*/
