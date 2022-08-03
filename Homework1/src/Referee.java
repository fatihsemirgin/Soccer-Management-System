
public class Referee {
	private String name;
	private Address address;
	private Phone phone_referee;
	private double salary;
	private int referee_id;
	
	public Referee() {
		
	}

	public Referee(String name, Address address, Phone phone_referee, double salary, int referee_id) {
		this.name = name;
		this.address = address;
		this.phone_referee = phone_referee;
		this.salary = salary;
		this.referee_id = referee_id;
	}
	
	public void display() {
		System.out.print("Referee's Name : "+this.name+"\tReferee's ID : "+this.referee_id+"\nReferee Address : "+this.address.display()+"\nReferee Phone : "+this.phone_referee.display()+"\nReferee Salary : "+this.salary);
		
		System.out.println();
	}

	public int getReferee_id() {
		return referee_id;
	}

	public void setReferee_id(int referee_id) {
		this.referee_id = referee_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phone getPhone_referee() {
		return phone_referee;
	}
	public void setPhone_referee(Phone phone_referee) {
		this.phone_referee = phone_referee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return referee_id;
	}
	public void setId(int referee_id) {
		this.referee_id = referee_id;
	}
	
	
	
}
