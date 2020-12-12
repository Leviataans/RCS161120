
public class task16 {

	public static void main(String[] args) {
		int[] masivs = { 0, 4, 0, 7, 8, 9, 0, 1 };
		for (int i = 0; i < masivs.length; i++) {
			System.out.print(masivs[i] + "; ");
		}
		System.out.println();


		for (int i = 0; i < masivs.length; i++) {
			for (int j = 1; j < masivs.length; j++) {
				if (masivs[j-1] == 0) {
					int temp = masivs[j-1];
					masivs[j-1] = masivs[j];
					masivs[j] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < masivs.length; i++) {
			System.out.print(masivs[i] + "; ");
		}

	}

}
