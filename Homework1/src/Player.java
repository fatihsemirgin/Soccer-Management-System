
public class Player {
	private int license_number;
	private String team;
	private double salary;
	private Phone phone_player;
	private String name_surname;
	private String nationality;
	private Address address;
	private Date birthdate;
	private Date contract_date,end_date;
	private String position_of_player;
	private int id_player;
	
	public Player(int license_number,String name_surname,Date birthdate,String nationality,Address address,
			Phone phone_player, String team,Date contract_date,Date end_date, double salary,String position_of_player, int id_player) {
		this.license_number = license_number;
		this.team = team;
		this.salary = salary;
		this.phone_player = phone_player;
		this.name_surname = name_surname;
		this.nationality = nationality;
		this.address = address;
		this.birthdate = birthdate;
		this.contract_date = contract_date;
		this.end_date = end_date;
		this.position_of_player = position_of_player;
		this.id_player=id_player;
	}

	public void display() {
		System.out.println("License number of the player : "+this.license_number+"\tPlayer's ID : "+this.id_player+"\nPlayer's name and surname : "+this.name_surname+"\nPlayer's birthdate : "+this.birthdate.display()+"\nPlayer's nation : "+this.nationality+
				"\nPlayer's address : "+this.address.display()+"\nPlayer's phone : "+this.phone_player.display()+"\nPlayer's team : "+this.team+
				"\nPlayer's contract start date : "+this.contract_date.display()+"\nPlayer's contract end date : "+this.end_date.display()+"\nPlayer's salary : "+this.salary+"\nPlayer's position role : "+this.position_of_player);
	}
	
	public int getLicense_number() {
		return license_number;
	}
	public void setLicense_number(int license_number) {
		this.license_number = license_number;
	}
	public Phone getPhone_player() {
		return phone_player;
	}
	public void setPhone_player(Phone phone_player) {
		this.phone_player = phone_player;
	}
	public String getName_surname() {
		return name_surname;
	}
	public void setName_surname(String name_surname) {
		this.name_surname = name_surname;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Date getContract_date() {
		return contract_date;
	}
	public void setContract_date(Date contract_date) {
		this.contract_date = contract_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getPosition_of_player() {
		return position_of_player;
	}
	public void setPosition_of_player(String position_of_player) {
		this.position_of_player = position_of_player;
	}
	
	
}
