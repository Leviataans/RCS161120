import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("L�dzu ievadiet pirmo skaitli: ");
			int pirmais_skaitlis = sc.nextInt();
			
			System.out.print("L�dzu ievadiet otro skaitli: ");
			int otrais_skaitlis = sc.nextInt();
			
			System.out.print("L�dzu ievadiet tre�o skaitli: ");
			int tresais_skaitlis = sc.nextInt();
			
			System.out.println("Ievad�to skait�u vid�jais aritm�tiskais ir: " + ((pirmais_skaitlis + otrais_skaitlis + tresais_skaitlis)/3));
			
			System.out.print("V�laties atk�rtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
