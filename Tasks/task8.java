import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("L�dzu ievadiet pirmo skaitli: ");
			int pirmais_skaitlis = sc.nextInt();
			
			System.out.print("L�dzu ievadiet otro skaitli: ");
			int otrais_skaitlis = sc.nextInt();
			
			String virkne = "";
			
			for (int i = pirmais_skaitlis; i <= otrais_skaitlis; i++) {
				if ((i % 2) == 0 && (i % 3) == 0 && (i % 5) != 0) {
					virkne += i + ", ";
				}
			}
			
			System.out.println(virkne.substring(0, virkne.length() - 2));
			
			System.out.print("V�laties atk�rtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
