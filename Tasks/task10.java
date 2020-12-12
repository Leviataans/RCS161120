import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);

		while (atkartot) {
			System.out.print("L�dzu ievadiet burtu: ");
			String burts = sc.next();

			if (burts.isEmpty() || burts.isBlank()) {
				System.err.println("Neesat ievad�jis neko!");
			} else if (burts.length() > 1) {
				System.err.println("Dr�kst ievad�t tikai vienu burtu!");
			} else {
				System.out.println(parbaude(burts));
			}

			System.out.print("V�laties atk�rtot? True/False: ");
			atkartot = sc.nextBoolean();

		}
		sc.close();

	}

	public static String parbaude(String burts) {
		String patskani[] = { "a", "�", "e", "�", "i", "�", "u", "�" };
		String lidzskani[] = { "r", "t", "p", "s", "�", "d", "f", "g", "�", "h", "j", "k", "�", "l", "�", "z", "�", "c",
				"�", "v", "b", "n", "�", "m" };
		String divskani[] = { "o" };

		String atbilde = "Izmanto tikai latvie�u alfab�tu!";
		for (int i = 0; i < patskani.length; i++) {
			if (burts.equals(patskani[i])) {
				atbilde = "Patskanis";
			}
		}
		for (int i = 0; i < lidzskani.length; i++) {
			if (burts.equals(lidzskani[i])) {
				atbilde = "L�dzskanis";
			}
		}
		for (int i = 0; i < divskani.length; i++) {
			if (burts.equals(divskani[i])) {
				atbilde = "Divskanis";
			}
		}

		return atbilde;
	}

}
