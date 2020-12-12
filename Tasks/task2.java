import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("Lûdzu ievadiet pirmo skaitli: ");
			int pirmais_skaitlis = sc.nextInt();
			
			System.out.print("Lûdzu ievadiet otro skaitli: ");
			int otrais_skaitlis = sc.nextInt();
			
			System.out.print("Lûdzu ievadiet treðo skaitli: ");
			int tresais_skaitlis = sc.nextInt();
			
			System.out.println("Ievadîto skaitïu vidçjais aritmçtiskais ir: " + ((pirmais_skaitlis + otrais_skaitlis + tresais_skaitlis)/3));
			
			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
