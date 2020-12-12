import java.util.Arrays;
import java.util.Random;

public class task21 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] pirmais_ints = new int[random.nextInt(10)+1];
		int[] otrais_ints = new int[random.nextInt(10)+1];
		for (int i = 1; i < pirmais_ints.length; i++) {
			pirmais_ints[i] = random.nextInt(10)+1;
		}
		for (int i = 1; i < otrais_ints.length; i++) {
			otrais_ints[i] = random.nextInt(10)+1;
		}
		System.out.println("Pirmais ciparu masîvs: " + Arrays.toString(pirmais_ints));
		System.out.println("Otrais ciparu masîvs: " + Arrays.toString(otrais_ints));

		int[] lielais_int_masivs = new int[(pirmais_ints.length+otrais_ints.length)];
		for (int i = 0; i < pirmais_ints.length; i++) {
			lielais_int_masivs[i] = (pirmais_ints[i]*pirmais_ints[i]*pirmais_ints[i]); 
		}
		for (int i = 0; i < otrais_ints.length; i++) {
			lielais_int_masivs[(i+pirmais_ints.length)] = (otrais_ints[i]*otrais_ints[i]*otrais_ints[i]); 
		}
		System.out.println("Lielais ciparu masîvs: " + Arrays.toString(lielais_int_masivs));
	}

}
