import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet savu v�rdu: ");
		String name = sc.next();
		System.out.print("Ievadiet pirmo skaitli: ");
		int i = sc.nextInt();
		System.out.print("Ievadiet otro skaitli: ");
		int j = sc.nextInt();
		
		sc.close();
		
		if (i < j) {
			System.out.println("Skaitlis "+j+" ir liel�ks par skaitli "+i);
		} else if (i > j) {
			System.out.println("Skaitlis "+i+" ir liel�ks par skaitli "+j);
		} else {
			System.out.println("Skaitlis "+i+" un "+j+" ir vien�di!");
		}
		
		if ((i+j) > name.length()) {
			System.out.println("Skati�u "+i+" un "+j+" summa ir "+(i+j)+", kas ir vair�k nek� cik burtu Tav� v�rd�!");
		} else if ((i+j) < name.length()) {
			System.out.println("Skati�u "+i+" un "+j+" summa ir "+(i+j)+", kas ir maz�k nek� cik burtu Tav� v�rd�!");
		} else {
			System.out.println("Skati�u "+i+" un "+j+" summa ir "+(i+j)+", tikpat cik burtu Tav� v�rd�!");
		}

	}

}
