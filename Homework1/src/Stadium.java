
public class Stadium {
	private String name,city;
	private double capasity;
	private boolean lighting;
	private String surface;
	private int stadium_id;

	public Stadium(String name, String city, double capasity, boolean lighting, String surface, int stadium_id) {
		this.name = name;
		this.city = city;
		this.capasity = capasity;
		this.lighting = lighting;
		this.surface = surface;
		this.stadium_id = stadium_id;
	}
	public Stadium() {
		
	}
	
	public void display() {
		System.out.println("Stadium name : "+this.name+"\t Stadium ID : "+this.stadium_id+"\nCity : "+this.city
				+"\nCapasity : "+this.capasity+"\nLighting : "+this.lighting+ "\nSurface : "+this.surface);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCapasity() {
		return capasity;
	}
	public void setCapasity(double capasity) {
		this.capasity = capasity;
	}
	public boolean isLighting() {
		return lighting;
	}
	public void setLighting(boolean lighting) {
		this.lighting = lighting;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public int getStadium_id() {
		return stadium_id;
	}
	public void setStadium_id(int stadium_id) {
		this.stadium_id = stadium_id;
	}
	
	
}
