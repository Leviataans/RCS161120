import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masîva garums: ");
		int garums = sc.nextInt();
		System.out.println("Masîva platums: ");
		int platums = sc.nextInt();
		int masivs[][] = new int[garums][platums];
		System.out.println("Ievadiet " + garums * platums + " skaitïus: ");
		for (int i = 0; i < garums; i++) {
			for (int j = 0; j < platums; j++) {
				masivs[i][j] = sc.nextInt();
			}
		}

		sc.close();

		if (garums != platums) {
			System.out.println("Ðis noteikti nav maìiskais kvadrâts, jo nav pat kvadrâts!");
		} else {
			int summa = 0;
			int pareizu_atbilzu_skaits = platums * 2 + 2;
			int pareizas_rindas = 0;
			for (int i = 0; i < masivs.length; i++) {
				summa += masivs[i][0];
			}

			int iekseja_summa = 0;
			for (int i = 0; i < masivs.length; i++) {
				iekseja_summa = 0;
				for (int j = 0; j < masivs.length; j++) {
					iekseja_summa += masivs[i][j];
				}
				if (iekseja_summa == summa) {
					pareizas_rindas++;
				}
			}

			for (int j = 0; j < masivs.length; j++) {
				iekseja_summa = 0;
				for (int i = 0; i < masivs.length; i++) {
					iekseja_summa += masivs[i][j];
				}
				if (iekseja_summa == summa) {
					pareizas_rindas++;
				}
			}

			iekseja_summa = 0;
			for (int i = 0; i < masivs.length; i++) {
				iekseja_summa += masivs[i][i];
			}
			if (iekseja_summa == summa) {
				pareizas_rindas++;
			}

			iekseja_summa = 0;
			int j = masivs.length - 1;
			for (int i = 0; i < masivs.length; i++) {
				iekseja_summa += masivs[i][j];
				j--;
			}
			if (iekseja_summa == summa) {
				pareizas_rindas++;
			}


			System.out.println(
					Arrays.stream(masivs).map(Arrays::toString).collect(Collectors.joining(System.lineSeparator())));
			if (garums != platums) {
				System.out.println("Ðis nav maìiskais kvadrâts");
			} else if (pareizas_rindas == pareizu_atbilzu_skaits) {
				System.out.println("Ðis ir maìiskais kvadrâts!");
			} else {
				System.out.println("Ðis nav maìiskais kvadrâts");
			}
		}
	}

}
