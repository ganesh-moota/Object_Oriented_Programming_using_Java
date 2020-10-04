/*
Encapsulation - 
make the members of class private
create getter and setter methods for each member.
*/

class Employee {
	private String Ename;
	private int age;

	public void setName(String name) {
		this.Ename = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName(){
		return this.Ename;
	}

	public int getAge(){
		return this.age;
	}
}

class Encapsulation {
	public static void main(String args[]){
		Employee e = new Employee();

		e.setName("Ganesh");
		e.setAge(20);

		System.out.println(e.getName());
		System.out.println(e.getAge());
	}
}