package zadacha10;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        ArrayList<Integer> unija = new ArrayList<Integer>();
        unija.addAll(l1);
        unija.addAll(l2);
        System.out.println("L1 : "+l1);
        System.out.println("L2 : "+l2);
        System.out.println("Unija : "+unija);
	}

}
