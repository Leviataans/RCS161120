import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("Lûdzu ievadiet pirmo skaitli: ");
			int pirmais_skaitlis = sc.nextInt();
			
			System.out.print("Lûdzu ievadiet otro skaitli: ");
			int otrais_skaitlis = sc.nextInt();
			
			int summa = pirmais_skaitlis + otrais_skaitlis;
			if (summa >= 10 && summa < 20) {
				System.out.println("Atbilde ir: 20");
			} else {
				System.out.println("Atbilde ir: " + summa);
			}
			
			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
