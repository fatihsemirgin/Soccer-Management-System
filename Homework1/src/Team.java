
public class Team {
	
	private String name;
	private int foundation_year;
	private int number_of_cups;
	private String colors;
	private int team_id;
	public int team_point=0;  // Team's total score in the league
	
	private Player [] players;
	private int count_player;
	private Coach [] coaches;
	private int count_coach;
	private Company [] companies;
	private int count_company;
	public Stadium [] stadiums;
	private int c_stadiums;
	
	Team(){
	
	}
	Team(String name, int foundation_year, int number_of_cups, String colors, int team_id){
		this.name = name;
		this.foundation_year = foundation_year;
		this.number_of_cups = number_of_cups;
		this.colors = colors;
		this.team_id=team_id;
		players = new Player[30];
		coaches= new Coach[1];
		stadiums = new Stadium[1];
		companies = new Company[1];
		count_company=0;
		c_stadiums=0;
		count_coach=0;
		count_player=0;
	}
	public int Scor() {  
		return team_point;
	}
	public void display() {
		System.out.println("Team name : "+this.name+"\tTeam Id : "+this.team_id+"\nFoundation year : "+this.foundation_year+"\nNumber of Cups : "+this.number_of_cups+"\nTeam colors : "+this.colors);
	}
	
	public void addPlayer(Player p) {
		players[count_player]= p;
		count_player++;
	}
	public void listPlayer() {
		for(int i=0;i<count_player;i++) {
			if(players[i]!=null) {
				players[i].display();
			}
		}
	}
	public void deletePlayer(int licence_number) {
		for(int i=0;i<count_player;i++) {
			if(players[i].getLicense_number()==licence_number) {
				//players[i].display();
				System.out.println(">>>>>> Player "+players[i].getName_surname()+" #"+ licence_number+" is deleted");
				players[i]=null;
			}	
		}
	}
	public void addCoach(Coach c) {
		coaches[count_coach]= c;
		count_coach++;
	}
	public void listCoach() {
		for(int i=0;i<count_coach;i++) {
			coaches[i].display();
		}
	}
	
	public void addStadium(String name, String city, int capasity, boolean lighting ,String surface) {
		Stadium stadium = new Stadium(name,city,capasity,lighting,surface,League.c_stadiums2);
		stadiums[c_stadiums]= stadium;
		c_stadiums++;
	}
	public void listStadium() {
		for(int i=0;i<c_stadiums;i++) {
			stadiums[i].display();
		}
	}
	
	public void addCompany(String name, Address address, Phone phone, String team) {
		Company company = new Company(name,address,phone,team,League.count_company2);
		companies[count_company]=company;
		count_company++;
	}
	public void listCompany() {
		for(int i=0;i<c_stadiums;i++) {
			companies[i].display();
			
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFoundation_year() {
		return foundation_year;
	}
	public void setFoundation_year(int foundation_year) {
		this.foundation_year = foundation_year;
	}
	public int getNumber_of_cups() {
		return number_of_cups;
	}
	public void setNumber_of_cups(int number_of_cups) {
		this.number_of_cups = number_of_cups;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}

	public class Coach {
		private String name_surname;
		private String team;
		private Date contract_date,end_date;
		private double salary;
		private Address address_c;
		private Phone phone_coach;
		private int coach_id;
		
		public Coach(String name_surname,Address address_c,Phone phone_coach,String team, 
				Date contract_date, Date end_date, double salary, int coach_id) {
			this.name_surname = name_surname;
			this.contract_date = contract_date;
			this.end_date = end_date;
			this.salary = salary;
			this.address_c = address_c;
			this.team=team;
			this.phone_coach = phone_coach;
			this.coach_id = coach_id;
		}
		
		public void display() {
			System.out.println("Coach's name and surname : "+this.name_surname+"\tCoach's ID : "+this.coach_id+"\nCoach' salary : "+this.salary+"\nCoach's team : "+this.team);
		}
		
		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		public int getCoach_id() {
			return coach_id;
		}
		public void setCoach_id(int coach_id) {
			this.coach_id = coach_id;
		}
		
		public String getName_surname() {
			return name_surname;
		}
		public void setName_surname(String name_surname) {
			this.name_surname = name_surname;
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Address getAddress_c() {
			return address_c;
		}
		public void setAddress_c(Address address_c) {
			this.address_c = address_c;
		}
		public Phone getPhone_coach() {
			return phone_coach;
		}
		public void setPhone_coach(Phone phone_coach) {
			this.phone_coach = phone_coach;
		}
		public Phone getPhone_no() {
			return phone_coach;
		}
		public void setPhone_no(Phone phone_no) {
			this.phone_coach = phone_no;
		}
		
		
		
	}
	
	
	
}
