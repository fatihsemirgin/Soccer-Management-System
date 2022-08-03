
public class Company {
	private String name;
	private Address address;
	private Phone phone;
	private String team;
	private int comp_id;
	
	public Company(String name, Address address, Phone phone, String team, int comp_id) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.team = team;
		this.comp_id = comp_id;
	}
	
	public void display() {
		System.out.println("Company name : "+this.name+"\t Company ID : "+this.comp_id+"\nCompany Address : "+this.address.display()
		+"\nCompany Phone : "+this.phone.display()+"\nTeam : "+this.team);
		
	}
	
	public int getComp_id() {
		return comp_id;
	}
	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
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
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
		
}

