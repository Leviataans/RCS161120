import java.text.DateFormatSymbols;
import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("L�dzu ievadiet skaitli: ");
			String skaitlis = sc.next();
			int cipars = Integer.parseInt(skaitlis);
			
			try {
				System.out.println(new DateFormatSymbols().getMonths()[cipars-1]);
			} catch (Exception e) {
				System.err.println("J�s esat ievad�ju�i nekorektu ciparu!");
			}
			
			System.out.print("V�laties atk�rtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
