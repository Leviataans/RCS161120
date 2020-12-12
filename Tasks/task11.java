import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("Lûdzu ievadiet skaitli: ");
			int skaitlis = sc.nextInt();
			
			for (int i = 0; i <= skaitlis; i++) {
				System.out.println(skaitlis + " X " + i + " = " + (skaitlis * i));
			}
			
			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
