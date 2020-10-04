/*
Methods in interface do not have body
Methods in interface must be overriden by the class implementing it.
Interface cannot implement another interface.
*/

interface Interface1 {
	public void methodA();
}

interface Interface2 {
	public void methodB();
}

class MyClass implements Interface1,Interface2{
	public void methodA(){
		System.out.println("Overriding Method A of interface 1");
	}

	public void methodB(){
		System.out.println("Overriding Method B of interface 2");
	}
}
class InterfaceExample {
	public static void main(String args[]){
		MyClass obj = new MyClass();

		obj.methodA();
		obj.methodB();
	}
}