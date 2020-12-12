
public class task14 {

	public static void main(String[] args) {
		String[] masivs = { "1", "2", "3", "5", "8", "30", "15", "12", "7" };
		for (int i = 0; i < masivs.length; i++) {
			if (Integer.valueOf(masivs[i]) % 3 == 0 && Integer.valueOf(masivs[i]) % 5 != 0) {
				masivs[i] = "fizz";
			} else if (Integer.valueOf(masivs[i]) % 3 != 0 && Integer.valueOf(masivs[i]) % 5 == 0) {
				masivs[i] = "buzz";
			} else if (Integer.valueOf(masivs[i]) % 3 == 0 && Integer.valueOf(masivs[i]) % 5 == 0) {
				masivs[i] = "fizzBuzz";
			}
			System.out.print(masivs[i] + "; ");
		}
	}

}
