package zadacha07;
import java.util.ArrayList;
import java.util.List;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mail = new ArrayList<>();
		
		
		for (int i=1; i<21; i++) {
			mail.add("mail" + String.format("%02d", i) + "@yahoo.com");
		}
		System.out.println("Elementi na listata se: " + mail);
	}

}
