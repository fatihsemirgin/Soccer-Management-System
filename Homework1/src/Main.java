
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		
		League league = new League("SuperLeague",640);
		System.out.println("       ************** THE "+league.getName().toUpperCase()+" **************\n");
		league.reading();
		league.ListAll();
		league.listMatch();
		league.listSkor();
		league.statistics();
		league.operations();
		System.out.println("\n       ************** THE "+league.getName().toUpperCase()+" **************");
	}

}
