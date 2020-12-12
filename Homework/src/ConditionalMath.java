import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet savu vârdu: ");
		String name = sc.next();
		System.out.print("Ievadiet pirmo skaitli: ");
		int i = sc.nextInt();
		System.out.print("Ievadiet otro skaitli: ");
		int j = sc.nextInt();
		
		sc.close();
		
		if (i < j) {
			System.out.println("Skaitlis "+j+" ir lielâks par skaitli "+i);
		} else if (i > j) {
			System.out.println("Skaitlis "+i+" ir lielâks par skaitli "+j);
		} else {
			System.out.println("Skaitlis "+i+" un "+j+" ir vienâdi!");
		}
		
		if ((i+j) > name.length()) {
			System.out.println("Skatiïu "+i+" un "+j+" summa ir "+(i+j)+", kas ir vairâk nekâ cik burtu Tavâ vârdâ!");
		} else if ((i+j) < name.length()) {
			System.out.println("Skatiïu "+i+" un "+j+" summa ir "+(i+j)+", kas ir mazâk nekâ cik burtu Tavâ vârdâ!");
		} else {
			System.out.println("Skatiïu "+i+" un "+j+" summa ir "+(i+j)+", tikpat cik burtu Tavâ vârdâ!");
		}

	}

}
