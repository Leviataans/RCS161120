import java.util.Arrays;
import java.util.Random;

public class task23 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] masivs = new int[random.nextInt(10) + 1];
		for (int i = 0; i < masivs.length; i++) {
			masivs[i] = random.nextInt(10) + 1;
		}
		System.out.println("Skaitïu masîvs: " + Arrays.toString(masivs));
int dublikati = 0;
		for (int i = 0; i < masivs.length; i++) {
			for (int j = (i + 1); j < masivs.length; j++) {
				if (masivs[i] == masivs[j]) {
					if ((j + 1) < masivs.length) {
						int temp = masivs[j];
						masivs[j] = masivs[j + 1];
						masivs[j + 1] = temp;
					} else {
						dublikati++;
					}
				}
			}
		}
		int[] masiva_kopija = new int[masivs.length - dublikati];

		System.arraycopy(masivs, 0, masiva_kopija, 0, (masivs.length - dublikati));

		masivs = masiva_kopija;
if (dublikati > 0 ) {
	System.out.println("Pçc dublikâtu izmeðanas masîvs izskatâs ðâdi: " + Arrays.toString(masivs));
} else {
	System.out.println("Nebija nevina dublikâta!");
}
		
	}

}
