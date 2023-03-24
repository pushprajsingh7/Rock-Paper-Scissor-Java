import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int count = 0;
	static int trial=5;
	static List<String> win=new ArrayList<>();
	static List<String>lost=new ArrayList<>();
	static List<String> draw=new ArrayList<>();
	public static void main(String args[]) {
		
		Program pg = new Program();
		
		System.out.println("Total chances are 5");
		do {
			Map<Integer, String> options = new LinkedHashMap<>();
			options.put(0, "Rock");
			options.put(1, "Paper");
			options.put(2, "Scissor");
			options.put(9, "terminate");
			System.out.println("Please select an option from numbers : "+options);
			Scanner sc = new Scanner(System.in);
			int selected = sc.nextInt();
			System.out.println("You selected :"+selected);
			Set<Integer> keyset = options.keySet();
			Random random = new Random();
			String Automatic = options.get(random.nextInt(keyset.size() - 1));
			
			
			if (selected == 0) {
				System.out.println("Selected option is 0: Rock ");
			} else if (selected == 1) {
				System.out.println("Selected option is 2: Paper ");
			} else if (selected == 2) {
				System.out.println("Selected option is 2: Scissor ");
			}
			else if(selected==9) {
				trial=0;
				System.out.println("Session Inturrupted by User");
				break;
			}
			Boolean flag = options.containsKey(selected);
			try {
				pg.logic(win,selected,flag,Automatic,options,lost,draw);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			trial--;
			System.out.println("Left chances are "+trial);
			
		} while (trial != 0);
		if (trial == 0) {
			analysis();
		}
	
	}
	public static void analysis() {
		System.out.println("Session Analysis : ");
		System.out.println("Played times is :" + count);
		System.out.println("Free trial remaining is :" + trial);
		System.out.println("Won times :"+win.size());
		System.out.println("Lost times  :"+lost.size());
		System.out.println("No Contest :"+draw.size());
		System.out.println("Terminated");
	}
}
