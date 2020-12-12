import java.util.Random;
import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		while (atkartot) {
			int skaitlis = new Random().nextInt(10)+1;
			System.out.println("I have chosen number between 1 and 10, try to guess it.");

			System.out.println("What's your number?");
			int minejums = 0;
			
			minejums = sc.nextInt();
			while (minejums != skaitlis) {
				System.out.println("Nop, try again.");
				minejums = sc.nextInt();
			}
			System.out.println("Correct, the number was " + minejums);
			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();

		}
		sc.close();
	}

}
