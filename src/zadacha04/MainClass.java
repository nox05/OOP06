package zadacha04;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> celiBroevi = new ArrayList<>();
		
		celiBroevi.add(5);
		celiBroevi.add(3);
		celiBroevi.add(7);
		celiBroevi.add(9);
		celiBroevi.add(8);
		Collections.sort(celiBroevi);
	
		System.out.println("Elementi na listata se: " + celiBroevi);
	}

}
