import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("Lûdzu ievadiet pirmo teksta gabalu: ");
			String pirmais_teksts = sc.next();
			
			System.out.print("Lûdzu ievadiet otro teksta gabalu: ");
			String otrais_teksts = sc.next();
			
			if (pirmais_teksts.length() >= otrais_teksts.length()) {
				System.out.println(otrais_teksts + pirmais_teksts + otrais_teksts);
			} else {
				System.out.println(pirmais_teksts + otrais_teksts + pirmais_teksts);
			}
			
			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
