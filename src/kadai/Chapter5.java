package kadai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
	
		List<Task> list1 = new ArrayList<>();
				Task task1 = new Task(LocalDate.of(2021,10,21),"牛乳を買う");
				list1.add(task1);
				Task task2 = new Task(LocalDate.of(2021,9,15),"○○社面談");
				list1.add(task2);
				Task task3 = new Task(LocalDate.of(2021,12,4),"手帳を買う");
				list1.add(task3);
				Task task4 = new Task(LocalDate.of(2021,8,10)," 散髪に行く");
				list1.add(task4);
				Task task5 = new Task(LocalDate.of(2021,11,9),"スクールの課題を解く");
				list1.add(task5);
				
				list1.sort((a,b)->a.getDate().compareTo(b.getDate()));
				for(Task t : list1) {
					System.out.println(t.getDate()+" "+t.getTask());
				}
		}
}
