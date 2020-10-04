/*
Binding can be of 2 types:
1)static binding (can be resolved at compile time)
2)dynamic binding (cannot be resolved at compile time)

Note:
if a method of parent class is getting override by child class
and the method is declared as static or private or final in parent class
and the obj reference is of parent class(irrespective which obj it is referencing to) 
then it will always 
call the method of parent class because such methods do not actually get override
Therefore, such binding can be done at the compile time itself.
*/


class Human {
	//this method will not get override
	public static void walk()
	{
	    System.out.println("Human walks");
	}
}

class Boy extends Human{
	public static void walk()
	{
	    System.out.println("Boy walks");
	}
}

class StaticBinding {
	public static void main(String args[]){
		Human obj1 = new Boy();
		
		Human obj2 = new Human();
		obj1.walk();
		obj2.walk();
	}
}


/*
Console Output:
Human walks
Human walks



src:-https://beginnersbook.com/2013/04/java-static-dynamic-binding/
*/