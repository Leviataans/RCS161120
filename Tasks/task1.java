import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("Lûdzu ievadiet pirmo skaitli: ");
			int pirmais_skaitlis = sc.nextInt();
			
			System.out.print("Lûdzu ievadiet otro skaitli: ");
			int otrais_skaitlis = sc.nextInt();
			
			System.out.println("Skaitïu summa ir: " + (pirmais_skaitlis + otrais_skaitlis));
			
			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
