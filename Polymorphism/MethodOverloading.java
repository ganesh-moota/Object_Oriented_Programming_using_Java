/*
Method overloading is also known as compile time polymorphism (or static polymorphism)
But Why?
We know there is ambiguity due to same method name
but still compiler can distinguish them using their parameters at compile time itself.

Method Overloading takes place in same Class
Method Overriding takes place in parent and child class.
*/   

class A {
	public void printYourName(String fName){
		System.out.println("Hi, "+fName);
	}

	public void printYourName(String fName,String lName){
		System.out.println("Hi, "+fName+" "+lName);
	}

	public void add(int a,int b){
		System.out.println("Result = "+(a+b));	//() to avoid string concatenation
	}

	public void add(double a,double b){
		System.out.println("Result = "+(a+b));
	}
} 

class MethodOverloading {
	public static void main(String args[]){
		A obj = new A();

		obj.printYourName("Ganesh");
		obj.printYourName("Ganesh","Moota");

		obj.add(4,5);
		obj.add(4.2,3.7);

	}
}


/*
Console output:
Hi, Ganesh
Hi, Ganesh Moota
Result = 9
Result = 7.9
*/
