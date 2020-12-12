import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);

		while (atkartot) {
			System.out.print("Lûdzu ievadiet burtu: ");
			String burts = sc.next();

			if (burts.isEmpty() || burts.isBlank()) {
				System.err.println("Neesat ievadîjis neko!");
			} else if (burts.length() > 1) {
				System.err.println("Drîkst ievadît tikai vienu burtu!");
			} else {
				System.out.println(parbaude(burts));
			}

			System.out.print("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();

		}
		sc.close();

	}

	public static String parbaude(String burts) {
		String patskani[] = { "a", "â", "e", "ç", "i", "î", "u", "û" };
		String lidzskani[] = { "r", "t", "p", "s", "ð", "d", "f", "g", "ì", "h", "j", "k", "í", "l", "ï", "z", "þ", "c",
				"è", "v", "b", "n", "ò", "m" };
		String divskani[] = { "o" };

		String atbilde = "Izmanto tikai latvieðu alfabçtu!";
		for (int i = 0; i < patskani.length; i++) {
			if (burts.equals(patskani[i])) {
				atbilde = "Patskanis";
			}
		}
		for (int i = 0; i < lidzskani.length; i++) {
			if (burts.equals(lidzskani[i])) {
				atbilde = "Lîdzskanis";
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
