import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Program {
	void logic(List<String> list,int selected,boolean flag,String Automatic,Map<Integer,String>options,List<String>lost,List<String>draw) {
		String win = "you Win";
		String lose = "you lose";
		
		if (!(flag)) {
			System.out.println("enter any number from  displayed options: options are :" + options);
		} else {
			System.out.println("Automatic  is : " + Automatic);
			if (Automatic == "Rock" && selected == 1) {
				System.out.println(win);
				list.add(win);
				
				
			} else if (Automatic == "Paper" && selected == 2) {
				System.out.println(win);
				list.add(win);

				
			} else if (Automatic == "Scissor" && selected == 0) {
				System.out.println(win);
				list.add(win);

				
			} else if (selected == 0 && Automatic == "Paper") {
				System.out.println(lose);
				lost.add(lose);
				
			} else if (selected == 1 && Automatic == "Scissor") {
				System.out.println(lose);
				lost.add(lose);
				
			} else if (selected == 2 && Automatic == "Rock") {
				System.out.println(lose);
				lost.add(lose);
				
			} else {
				draw.add("draw");
				System.out.println("Game Draw");
				
			}
			
		}

	}

}
