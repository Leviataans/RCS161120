import java.util.Arrays;

public class task17 {

	public static void main(String[] args) {
		String[] masivs = { "ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO" };
		System.out.println("Sâkuma masîvs: " + Arrays.toString(masivs));

		int dublikati = 0;

		for (int i = 0; i < masivs.length; i++) {
			for (int j = (i + 1); j < masivs.length; j++) {
				if (masivs[i].equals(masivs[j])) {
					if ((j + 1) < masivs.length) {
						String temp = masivs[j];
						masivs[j] = masivs[j + 1];
						masivs[j + 1] = temp;
					} else {
						dublikati++;
					}
				}
			}
		}

		String[] masiva_kopija = new String[masivs.length - dublikati];

		System.arraycopy(masivs, 0, masiva_kopija, 0, (masivs.length - dublikati));
		
		masivs = masiva_kopija;
		
		System.out.println("Pçc dublikâtu izmeðanas masîvs izskatâs ðâdi: " + Arrays.toString(masivs));
		
	}

}
