package zadacha03;
import java.util.ArrayList;
import java.util.List;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> smerovi = new ArrayList<>();
		
		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add(2, "NOV SMER");
		
		System.out.println("Elementi na listata se: " + smerovi);
	}

}
