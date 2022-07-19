
public class Main {
	public static void main(String args[]) {
		int count = 0;
		int trial = 5;
		do {
			Program pg = new Program();

			pg.logic();
			count++;
			trial--;
			System.out.println("Played times is :" + count);
			System.out.println("Free trial remaining is :" + trial);
		} while (trial != 0);
		if (trial == 0) {
			System.out.println("Sport terminated");
		}
	}
}
