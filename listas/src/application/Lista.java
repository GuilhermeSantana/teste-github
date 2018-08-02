package application;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("GUILHERME");
		list.add("SANTANA");
		list.add(1, "SANTOS");
		
		
		System.out.println(list.size());
		
		//list.remove("SANTOS");
		//list.remove(0);
		
		list.removeIf(x -> x.charAt(0) == 'S');
		
		
		for(String x : list) {
			System.out.println(x);
		}
	}

}
