import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			int summa = 0;
			System.out.print("L�dzu ievadiet pirmo skaitli: ");
			int pirmais_skaitlis = sc.nextInt();
			
			System.out.print("L�dzu ievadiet otro skaitli: ");
			int otrais_skaitlis = sc.nextInt();
			
			System.out.print("L�dzu ievadiet tre�o skaitli: ");
			int tresais_skaitlis = sc.nextInt();
			
			if (pirmais_skaitlis != otrais_skaitlis && pirmais_skaitlis != tresais_skaitlis && otrais_skaitlis != tresais_skaitlis) {
        		summa = pirmais_skaitlis + otrais_skaitlis + tresais_skaitlis;
        	} else if (pirmais_skaitlis == otrais_skaitlis && pirmais_skaitlis != tresais_skaitlis) {
        		summa = tresais_skaitlis;
        	} else if (pirmais_skaitlis == tresais_skaitlis && pirmais_skaitlis != otrais_skaitlis) {
        		summa = otrais_skaitlis;
        	} else if (pirmais_skaitlis != otrais_skaitlis && otrais_skaitlis == tresais_skaitlis) {
        		summa = pirmais_skaitlis;
        	}
			System.out.println("Skait�u summa ir: "+summa);
			
			System.out.print("V�laties atk�rtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
