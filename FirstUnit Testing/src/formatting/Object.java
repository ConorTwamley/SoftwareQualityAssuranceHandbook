package formatting;

/*
 * This is an example of how a model class should look.
 * Each variable gets put on its own line and not joined together on one
 * then the blank constructor goes below the variables
 * then the constructor with the variables passed into it goes below that
 * then the getter and setter methods go below this
 * if you have a toString method it should be put after all of the getter and setter methods 
 */
public class Object {
	
	String name;
	String address;
	int age;
	
	public Object() {
		
	}
	
	public Object(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
