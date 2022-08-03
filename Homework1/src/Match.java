
public class Match {
	private Team home_team;
	private int home_team_goals;
	private Team away_team;
	private int away_team_goals;
	private Referee referee_id1;
	private Referee referee_id2;
	private Referee referee_id3;
	private Stadium stadium_id;
	private int match_id;
	
	public Match(Team home_team, int home_team_goals, Team away_team, int away_team_goals, Referee referee_id1,
			Referee referee_id2, Referee referee_id3, Stadium stadium_id, int match_id) {
		this.home_team = home_team;
		this.home_team_goals = home_team_goals;
		this.away_team = away_team;
		this.away_team_goals = away_team_goals;
		this.referee_id1 = referee_id1;
		this.referee_id2 = referee_id2;
		this.referee_id3 = referee_id3;
		this.stadium_id = stadium_id;
		this.match_id=match_id;
	}
	
	public void display() {
		System.out.println("Home-Team : "+this.home_team.getName()+"\tNumber of Goals : "+this.home_team_goals+"\tMatch ID : "+this.match_id+"\nAway-Team : "+this.away_team.getName()+"\tNumber of goals : "+this.away_team_goals+"\nReferee's id : "+this.referee_id1.getId()+"\t"+this.referee_id1.getName()
		+"\nReferee's id : "+this.referee_id2.getId()+"\t"+this.referee_id2.getName()+"\nReferee's id : "+this.referee_id3.getId()+"\t"+this.referee_id3.getName()+"\nStadium ID : "+this.stadium_id.getStadium_id()+"\t	Stadium name : "+this.stadium_id.getName());
	}
	
	
	public void playingMatch() {			/// This method calculates the points that teams earn in matches. It also calculates the total score of a team.
		if(this.home_team_goals>this.away_team_goals) {
			this.home_team.team_point+=3;
		}
		else if(this.away_team_goals>this.home_team_goals) {
			this.away_team.team_point+=3;
		}
		else if(this.away_team_goals==this.home_team_goals) {
			this.home_team.team_point+=1;
			this.away_team.team_point+=1;
		}
	}

	public Team getHome_team() {
		return home_team;
	}

	public void setHome_team(Team home_team) {
		this.home_team = home_team;
	}

	public int getHome_team_goals() {
		return home_team_goals;
	}

	public void setHome_team_goals(int home_team_goals) {
		this.home_team_goals = home_team_goals;
	}

	public Team getAway_team() {
		return away_team;
	}

	public void setAway_team(Team away_team) {
		this.away_team = away_team;
	}

	public int getAway_team_goals() {
		return away_team_goals;
	}

	public void setAway_team_goals(int away_team_goals) {
		this.away_team_goals = away_team_goals;
	}

	public Referee getReferee_id1() {
		return referee_id1;
	}

	public void setReferee_id1(Referee referee_id1) {
		this.referee_id1 = referee_id1;
	}

	public Referee getReferee_id2() {
		return referee_id2;
	}

	public void setReferee_id2(Referee referee_id2) {
		this.referee_id2 = referee_id2;
	}

	public Referee getReferee_id3() {
		return referee_id3;
	}

	public void setReferee_id3(Referee referee_id3) {
		this.referee_id3 = referee_id3;
	}

	public Stadium getStadium_id() {
		return stadium_id;
	}

	public void setStadium_id(Stadium stadium_id) {
		this.stadium_id = stadium_id;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	
	
	
	
	
	
	
	
}
