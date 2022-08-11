package kadai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task {
	public static void main(String[] args) {
		HashMap<LocalDate, String> map1 = new HashMap<LocalDate, String>();
		map1.put(LocalDate.of(2021, 10, 21), "牛乳を買う");
		map1.put(LocalDate.of(2021, 9, 15), "○○社面談");
		map1.put(LocalDate.of(2021, 12, 4), "手帳を買う");
		map1.put(LocalDate.of(2021, 8, 10), "散髪に行く");
		map1.put(LocalDate.of(2021, 11, 9), "スクールの課題を解く");
		
		
		List<LocalDate> mapkey = new ArrayList<>(map1.keySet());
		mapkey.sort((s1,s2)->s1.compareTo(s2));
		
		for(LocalDate key :mapkey) {
			System.out.println(map1.get(key));
		}
	}
}
