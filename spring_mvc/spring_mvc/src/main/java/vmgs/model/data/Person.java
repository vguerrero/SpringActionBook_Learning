package vmgs.model.data;

public class Person {

	private String firtsName;
	private String lastName;
	private int age;
	private String address;
	private double salary;

	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [firtsName=" + firtsName + ", lastName=" + lastName
		        + ", age=" + age + ", address=" + address + ", salary=" + salary
		        + ", getFirtsName()=" + getFirtsName() + ", getLastName()="
		        + getLastName() + ", getAge()=" + getAge() + ", getAddress()="
		        + getAddress() + ", getSalary()=" + getSalary()
		        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
		        + ", toString()=" + super.toString() + "]";
	}


}
