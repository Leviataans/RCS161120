import java.util.Arrays;
import java.util.Random;

public class task22 {

	public static void main(String[] args) {
		Random random = new Random();
		int vardu_skaits = random.nextInt(10)+1;
		String[] vardi = new String[vardu_skaits];
		for (int i = 0; i < vardu_skaits; i++) {
			String vards = vards();
			vardi[i] = vards;
		}
		
		int noteikta_garuma_vardi = skaits(vardi);
		
		String[] modificetais_vardu_masivs = new String[(noteikta_garuma_vardi + vardi.length)];
		for (int i = 0; i < vardi.length; i++) {
			if (vardi[i].length() != 4) {
				if (modificetais_vardu_masivs[i] == null) {
					modificetais_vardu_masivs[i] = vardi[i];
				} else {
					int count = 0;
					do {
						count++;
					} while (modificetais_vardu_masivs[count] != null || count == modificetais_vardu_masivs.length);
					modificetais_vardu_masivs[count] = vardi[i];
				}
			} else {
				System.out.println("vardi["+i+"] == 4");
				int count = 0;
				if (modificetais_vardu_masivs[count] == null) {
					modificetais_vardu_masivs[count] = "****";
					modificetais_vardu_masivs[count+1] = vardi[i];
				} else {
					do {
						count++;
					} while (modificetais_vardu_masivs[count] != null);
					modificetais_vardu_masivs[count] = "****";
					modificetais_vardu_masivs[count+1] = vardi[i];
				}
			}
		}
		System.out.println("Vârdu masîvs: " + Arrays.toString(vardi));
		System.out.println("Modificçtais vârdu masîvs: " + Arrays.toString(modificetais_vardu_masivs));

	}
	
	public static String vards() {
		Random random = new Random();
		final int lielie_sakums = 65;
	    final int lielie_beigas = 90;
	    final int mazie_sakums = 97;
	    final int mazie_beigas = 122;
	    int varda_garums = random.nextInt(10)+1;
	    
	    StringBuilder buffer = new StringBuilder(varda_garums);
	    for (int i = 0; i < varda_garums; i++) {
	    	if (random.nextInt(2)+1 == 1) {
	        	int gadijuma_burts = lielie_sakums + (int) 
	      	          (random.nextFloat() * (lielie_beigas - lielie_sakums + 1));
	      	        buffer.append((char) gadijuma_burts);
	        } else {
	        	int gadijuma_burts = mazie_sakums + (int) 
	      	          (random.nextFloat() * (mazie_beigas - mazie_sakums + 1));
	      	        buffer.append((char) gadijuma_burts);
	        }
	    }
	    return buffer.toString();
	}
	
	public static int skaits(String[] masivs) {
		int skaits = 0;
		for (int i = 0; i < masivs.length; i++) {
			if (masivs[i].length() == 4) skaits++; 
		}
		return skaits;
	}

}
