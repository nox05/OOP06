package zadacha02;
import java.util.ArrayList;
import java.util.List;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> drzhavi = new ArrayList<>();
		
		drzhavi.add("Makedonija");
		drzhavi.add("Anglija");
		drzhavi.add("Brazil");
		
		System.out.println("Golemina na listata: " + drzhavi.size());
		
		if (drzhavi.size() == 3) {
			drzhavi.add("Shpanija");
			drzhavi.add("Portugalija");
			System.out.println("Golemina na listata: " + drzhavi.size());
			System.out.println("Elementi na listata se: " + drzhavi);
		} else 
			System.out.println("Elementi na listata se: " + drzhavi);
		
		
	}
}

