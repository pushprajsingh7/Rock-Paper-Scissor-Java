import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Program {
	void logic() {
		String win = "you Win";
		String lose = "you lose";
		Map<Integer, String> options = new LinkedHashMap<>();
		options.put(0, "Rock");
		options.put(1, "Paper");
		options.put(2, "Scissor");
		Set<Integer> keyset = options.keySet();
		Random random = new Random();
		String Automatic = options.get(random.nextInt(keyset.size() - 1));
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your option" + options);
		int selected = sc.nextInt();
		if (selected == 0) {
			System.out.println("Selected option is 0: Rock ");
		} else if (selected == 1) {
			System.out.println("Selected option is 2: Paper ");
		} else if (selected == 2) {
			System.out.println("Selected option is 2: Scissor ");
		}
		Boolean flag = options.containsKey(selected);
		if (!(flag)) {
			System.out.println("enter any number from  displayed options: options are :" + options);
		} else {
			System.out.println("Automatic  is : " + Automatic);
			if (Automatic == "Rock" && selected == 1) {
				System.out.println(win);
				
			} else if (Automatic == "Paper" && selected == 2) {
				System.out.println(win);
				
			} else if (Automatic == "Scissor" && selected == 0) {
				System.out.println(win);
				
			} else if (selected == 0 && Automatic == "Paper") {
				System.out.println(lose);
				
			} else if (selected == 1 && Automatic == "Scissor") {
				System.out.println(lose);
				
			} else if (selected == 2 && Automatic == "Rock") {
				System.out.println(lose);
				
			} else {
				System.out.println("Game Draw");
				
			}
			
		}

	}

}
