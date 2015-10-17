package collections;
import java.util.HashMap;
import java.util.Map;

public class Collect {
	public static void main(String[] args){
		System.out.println("Sherwain...");
		Map<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(1, "Sherwain");
		mp.put(2, "Gart");
		System.out.println(mp.remove("Sherwain"));
		System.out.println(mp.values());
	}
}
