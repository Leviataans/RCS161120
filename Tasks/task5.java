import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("L�dzu ievadiet pirmo skaitli: ");
			boolean parbaude = ir_intervala(sc.nextInt());
			
			System.out.println(parbaude);
			
			System.out.print("V�laties atk�rtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}
	
	public static boolean ir_intervala(int skaitlis) {
		if (skaitlis >= 50 && skaitlis < 100) {
			return true;
		} else {
			return false;
		}
	}

}
