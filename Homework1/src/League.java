import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class League {
		private String name;	
		private static Team [] teams;
		private int c_teams;
		private Match [] matches;
		private int c_matches;
		private Referee [] referees;
		private int c_referee;
		public static int count_coach2;  
		public static int c_stadiums2;
		public static int count_company2;	// These second counters are for IDs.
		public static int count_player2;
		League (String name, int c){
			this.name=name;
			teams = new Team[21];
			matches = new Match[c];		
			referees=new Referee[c];
			count_coach2=0;
			c_stadiums2=0;
			c_teams=0;
			c_referee=0;
			c_matches=0;
			count_company2=0;
			count_player2=0;	
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void addTeam(String name, int year, int cups, String colors) {
			Team team = new Team(name,year,cups,colors,c_teams+1);
			teams[c_teams]= team;
			c_teams++;
		}
		public void addReferee(String name, Address address, Phone phone_referee, double salary) {
			Referee referee = new Referee(name,address,phone_referee,salary,c_referee+1);
			referees[c_referee]=referee;
			c_referee++;
		}
		public void addMatch(Match match) {
			matches[c_matches]=match;
			c_matches++;
		}

		public void ListAll() {
			System.out.println("\n       ************** TEAMS **************\n");
			for(int i=0;i<c_teams;i++) {
				teams[i].display();
				System.out.println("               ***Coach of "+teams[i].getName()+"***");
				teams[i].listCoach();
				if(i<c_teams-1)
					System.out.println("-------------------------------------------------------------");			
			}
			System.out.println("\n       ************** PLAYERS **************\n");
			for(int i=0;i<c_teams;i++) {
				teams[i].listPlayer();
				if(i<c_teams-1) {
					System.out.println("-------------------------------------------------------------");
				}	
			}
			System.out.println("\n       ************** COMPANIES **************\n");
			for(int i =0;i<c_teams;i++) {
				teams[i].listCompany();	
				if(i<c_teams-1) {
					System.out.println("-------------------------------------------------------------");
				}
			}
			//for(int i =0;i<c_teams;i++) {
				//teams[i].listStadium();
				//System.out.println("-------------------------------------");
			//}
		}
		
		public void listMatch() {
			System.out.println("\n       ************** MATCHES **************\n");
			for(int i=0;i<c_matches;i++) {
				matches[i].display();
				if(i<c_matches-1) {
					System.out.println("-------------------------------------------------------------");
				}			
			}
		}
		public void listSkor() { 		// Method of playing and listing matches.
			for(int i=0;i<c_matches;i++) {
				matches[i].playingMatch();
			}
			System.out.println("\n       ************** SCORES **************\n");
			for(int i=0;i<c_teams;i++) { 
				System.out.println(teams[i].getName()+" : "+teams[i].Scor());
			}
		}
		
		public void statistics() {		// Method for determining the winning team and finding the stadium with the largest capacity.
			System.out.println("\n       ************** THE CHAMPION **************\n");
			double max2=0,max=0;		
			double point2=0,point=0;
			for(int i=0;i<c_teams;i++) {
				point = teams[i].Scor();
				if(max<point)
					max=point;
			}
			for(int i=0;i<c_teams;i++) {
				if(max==teams[i].team_point)
					System.out.println("	   THE WINNER TEAM -----> "+teams[i].getName());	
			}
			System.out.println("\n       ************** THE BIGGEST STADIUM **************\n");
			for(int i=0;i<c_teams;i++) {
				point2=teams[i].stadiums[0].getCapasity();
				if(max2<point2)
					max2=point2;
			}
			for(int i=0;i<c_teams;i++) {
				if(max2==teams[i].stadiums[0].getCapasity())
					System.out.println("The Biggest Capasity : "+ teams[i].stadiums[0].getName()+"\tCapasity : "+teams[i].stadiums[0].getCapasity());
			}	
		}

		public void operations() {			// To list the referees' salary and the referees.
			System.out.println("\n       ************** REFEREES **************\n");
			for(int i=0;i<c_referee;i++) {
				double salary2= referees[i].getSalary();
				salary2=salary2+((salary2*10)/100);
				referees[i].setSalary(salary2);
			}
			for(int i=0;i<c_referee;i++) {
				referees[i].display();
				if(i<c_referee-1)
					System.out.println("-------------------------------------------------------------");
			}			
		}
		public void reading() throws IOException {
			File dosya = new File("D://input.txt");
			BufferedReader inputStream = null;
	        try {
	        	 inputStream = new BufferedReader(
	        			new InputStreamReader(
	        			new FileInputStream(dosya), "UTF8"));                 
	            String satir;
	            while ((satir = inputStream.readLine()) != null) {
	            	String[] line = satir.split(";");
	            	
	                if(line[0].equalsIgnoreCase("addTeam")) {
	                	addTeam(line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]),line[4]);
	                }
	                else if(line[0].equalsIgnoreCase("addPlayer")) {
	                	
	                	/// These operations are for date checks and checks of data.
	                	boolean flag=true;
	                	if(Integer.parseInt(line[3])>0 && Integer.parseInt(line[4])>0 && Integer.parseInt(line[5])>0 
	                			&& Integer.parseInt(line[15])>0 && Integer.parseInt(line[16])>0 && Integer.parseInt(line[17])>0 
	                			&& Integer.parseInt(line[18])>0 && Integer.parseInt(line[19])>0 && Integer.parseInt(line[20])>0) {                	
	                	if(Integer.parseInt(line[4])<=7 || Integer.parseInt(line[16])<=7 || Integer.parseInt(line[19])<=7) {
	                		
	                		if(Integer.parseInt(line[4])%2==1) {
	                			if(Integer.parseInt(line[3])>31) {
	                				flag=false;
	                			}				
	                		}
	                		if(Integer.parseInt(line[16])%2==1) {
	                			if(Integer.parseInt(line[15])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[19])%2==1) {
	                			if(Integer.parseInt(line[18])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[4])%2==0) {

	                			if(Integer.parseInt(line[3])>30) {

	                				flag=false;
	                			}
	                			if(Integer.parseInt(line[4])==2 && Integer.parseInt(line[5])%4==0) {	// Check of the month of February
	                				if(Integer.parseInt(line[3])>29) {
	                					flag=false;
	                				}
	                			}
	                			else if(Integer.parseInt(line[4])==2 && Integer.parseInt(line[5])%4==1) {	// Check of the month of February
	                				if(Integer.parseInt(line[3])>28) {
	                					flag=false;
	                				}
	                			}
	                		}
	                		if(Integer.parseInt(line[16])%2==0) {
	                			if(Integer.parseInt(line[15])>30) {
	                				flag=false;
	                			}
	                			if(Integer.parseInt(line[16])==2 && Integer.parseInt(line[17])%4==0) {
	                				if(Integer.parseInt(line[15])>29) {
	                					flag=false;
	                				}
	                			}
	                			else if(Integer.parseInt(line[16])==2 && Integer.parseInt(line[17])%4==1) {
	                				if(Integer.parseInt(line[15])>28) {
	                					flag=false;
	                				}
	                			}
	                		}
	                		if(Integer.parseInt(line[19])%2==0) {
	                			if(Integer.parseInt(line[18])>30) {
	                				flag=false;
	                			}
	                			if(Integer.parseInt(line[19])==2 && Integer.parseInt(line[20])%4==0) {
	                				if(Integer.parseInt(line[18])>29) {
	                					flag=false;
	                				}
	                			}
	                			else if(Integer.parseInt(line[19])==2 && Integer.parseInt(line[20])%4==1) {
	                				if(Integer.parseInt(line[18])>28) {
	                					flag=false;
	                				}
	                			}
	                		}             	
	                	}
	                	else if(Integer.parseInt(line[4])>=8 || Integer.parseInt(line[16])>=8 || Integer.parseInt(line[19])>=8) {
	                		if(Integer.parseInt(line[4])%2==1) {
	                			if(Integer.parseInt(line[3])>31) {
	                				flag=false;
	                			}				
	                		}
	                		if(Integer.parseInt(line[16])%2==1) {
	                			if(Integer.parseInt(line[15])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[18])>31) {
	                			if(Integer.parseInt(line[15])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[4])%2==0) {

	                			if(Integer.parseInt(line[3])>30) {

	                				flag=false;
	                			}		
	                		}
	                		if(Integer.parseInt(line[16])%2==0) {
	                			if(Integer.parseInt(line[15])>30) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[19])%2==0) {
	                			if(Integer.parseInt(line[18])>30) {
	                				flag=false;
	                			}
	                		}
	                	}           	
	                	if(Integer.parseInt(line[20])<Integer.parseInt(line[17]))
	                		flag=false;
	                	else if(Integer.parseInt(line[20])==Integer.parseInt(line[17]) && Integer.parseInt(line[19])<Integer.parseInt(line[16]))
	                		flag=false;
	                	else if(Integer.parseInt(line[20])==Integer.parseInt(line[17]) && Integer.parseInt(line[19])==Integer.parseInt(line[16]) && Integer.parseInt(line[18])<Integer.parseInt(line[15]))
	                		flag=false;
	                	}
	                	else
	                		flag=false;
	                	Date date_birth = new Date(line[3],line[4],line[5]);
	                	Date date_start = new Date(line[15],line[16],line[17]);
	                	Date date_finish = new Date(line[18],line[19],line[20]);
	                	Address address = new Address(line[7],line[8],line[9],line[10]);
	                	Phone phone = new Phone(line[11],line[12],line[13]);
	                	count_player2++;
	                	if(flag==true) {
	                		Player player = new Player(Integer.parseInt(line[1]),line[2],date_birth,line[6],address,phone,line[14],date_start,date_finish,Integer.parseInt(line[21]),line[22],count_player2);
		                	for(int i = 0; i<c_teams;i++) {
		                		if(teams[i].getName().equalsIgnoreCase(line[14])) {
		                			teams[i].addPlayer(player);
		                		}
		                	}
	                	}  	
	                }
	                else if(line[0].equalsIgnoreCase("deletePlayer")) {
	                	for(int k=0;k<c_teams;k++) {
	                		teams[k].deletePlayer(Integer.parseInt(line[1]));
	                	}
	                }
	                else if (line[0].equalsIgnoreCase("addCoach")) {
	                	
	                	/// These operations are for date checks and checks of data.
	                	boolean flag=true;
	                	if(Integer.parseInt(line[10])>0 && Integer.parseInt(line[11])>0 && Integer.parseInt(line[12])>0 
	                			&& Integer.parseInt(line[13])>0 && Integer.parseInt(line[14])>0 && Integer.parseInt(line[15])>0) {                	
	                	if(Integer.parseInt(line[11])<=7 || Integer.parseInt(line[14])<=7) {

	                		if(Integer.parseInt(line[11])%2==1) {
	                			if(Integer.parseInt(line[10])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[14])%2==1) {
	                			if(Integer.parseInt(line[13])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[11])%2==0) {
	                			if(Integer.parseInt(line[10])>30) {
	                				flag=false;
	                			}
	                			if(Integer.parseInt(line[11])==2 && Integer.parseInt(line[12])%4==0) {
	                				if(Integer.parseInt(line[10])>29) {
	                					flag=false;
	                				}
	                			}
	                			else if(Integer.parseInt(line[11])==2 && Integer.parseInt(line[12])%4==1) {
	                				if(Integer.parseInt(line[10])>28) {
	                					flag=false;
	                				}
	                			}
	                		}
	                		if(Integer.parseInt(line[14])%2==0) {
	                			if(Integer.parseInt(line[13])>30) {
	                				flag=false;
	                			}
	                			if(Integer.parseInt(line[14])==2 && Integer.parseInt(line[15])%4==0) {	// Check of the month of February
	                				if(Integer.parseInt(line[13])>29) {
	                					flag=false;
	                				}
	                			}
	                			else if(Integer.parseInt(line[14])==2 && Integer.parseInt(line[15])%4==1) {	// Check of the month of February
	                				if(Integer.parseInt(line[13])>28) {
	                					flag=false;
	                				}
	                			}
	                		}             	
	                	}
	                	else if(Integer.parseInt(line[16])>=8 || Integer.parseInt(line[19])>=8) {
	                		
	                		if(Integer.parseInt(line[11])%2==1) {
	                			if(Integer.parseInt(line[10])>31) {
	                				flag=false;
	                			}
	                		}
	                		if(Integer.parseInt(line[14])>31) {
	                			if(Integer.parseInt(line[13])>31) 
	                				flag=false;
	                		}           
	                		if(Integer.parseInt(line[11])%2==0) {
	                			if(Integer.parseInt(line[10])>30)
	                				flag=false;
	                		}
	                		if(Integer.parseInt(line[14])%2==0) {
	                			if(Integer.parseInt(line[13])>30)
	                				flag=false;
	                		}
	                	}           	
	                	if(Integer.parseInt(line[15])<Integer.parseInt(line[12]))
	                		flag=false;
	                	else if(Integer.parseInt(line[15])==Integer.parseInt(line[12]) && Integer.parseInt(line[14])<Integer.parseInt(line[11]))
	                		flag=false;
	                	else if(Integer.parseInt(line[15])==Integer.parseInt(line[12]) && Integer.parseInt(line[14])==Integer.parseInt(line[11]) && Integer.parseInt(line[13])<Integer.parseInt(line[10]))
	                		flag=false;
	                	}
	                	else
	                		flag=false;
	                	Address address = new Address(line[2],line[3],line[4],line[5]);
	                	Date date_start = new Date(line[10],line[11],line[12]);
	                	Date date_end = new Date(line[13],line[14],line[15]);
	                	Phone phone = new Phone(line[6],line[7],line[8]);
	                	count_coach2++;
	                	if(flag==true) {
	                		Team.Coach coach = new Team().new Coach(line[1],address,phone,line[9],date_start,date_end,Double.parseDouble(line[16]),count_coach2);
		                	for(int i=0;i<c_teams;i++) {
		                		if(teams[i].getName().equalsIgnoreCase(line[9])) {
		                			teams[i].addCoach(coach);
		                		}
		                	}
	                	}
	                	
	                }
	                else if(line[0].equalsIgnoreCase("addStadium")) {
	                	c_stadiums2++;
	                	teams[c_stadiums2-1].addStadium(line[1],line[2],Integer.parseInt(line[3]),Boolean.parseBoolean(line[4]),line[5]);
	                }
	                else if(line[0].equalsIgnoreCase("addReferee")) {  /// Phone is not taken??
	                	Address address = new Address(line[2],line[3],line[4],line[5]);
	                	Phone phone = new Phone(line[6],line[7],line[8]);
	                	addReferee(line[1],address,phone,Double.parseDouble(line[9]));
	                }
	                else if(line[0].equalsIgnoreCase("addCompany")) {
	                	for(int i=0;i<c_teams;i++) {
	                		if(teams[i].getName().equalsIgnoreCase(line[9])) {
	                			count_company2++;
	                			Address address = new Address(line[2],line[3],line[4],line[5]);
	                			Phone phone = new Phone(line[6],line[7],line[8]);
	                			teams[i].addCompany(line[1],address,phone,line[9]);
	                		}
	                	}
	                }
	                else if (line[0].equalsIgnoreCase("addMatch")) {
	                	boolean flag=true;
	                	Team t1 = new Team();
	                	Team t2 = new Team();
	                	Referee r1 = new Referee();
	                	Referee r2 = new Referee();
	                	Referee r3 = new Referee();
	                	Stadium s1 = new Stadium();
	                	for(int i=0;i<c_teams;i++) {
	                		if(teams[i].getName().equalsIgnoreCase(line[1]))
	                			t1= teams[i];
	                		else if (teams[i].getName().equalsIgnoreCase(line[3]))
	                			t2= teams[i];
	                		if(teams[i].stadiums[0].getStadium_id()==Integer.parseInt(line[8]))
        						s1=teams[i].stadiums[0];
	                		else if(Integer.parseInt(line[8])>c_stadiums2)
	                			flag=false; 		
	                	}
	                	for(int k=0;k<c_referee;k++) {
	                		if(referees[k].getId()==Integer.parseInt(line[5]))
	                			r1 = referees[k];
	                		else if(referees[k].getId()==Integer.parseInt(line[6]))
	                			r2=referees[k];
	                		else if(referees[k].getId()==Integer.parseInt(line[7]))
	                			r3=referees[k];
	                		else
	                			flag=false;
	                	}
	                	if(flag==true) {
	                		if(Integer.parseInt(line[2])>=0 && Integer.parseInt(line[4])>=0){
	                			Match match =new Match(t1,Integer.parseInt(line[2]),t2,Integer.parseInt(line[4]),r1,r2,r3,s1,c_matches+1);
			                	addMatch(match);
	                		}
	                		
	                	}
	                	
	                }        
	            }
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	        }
		}
		
				
}
