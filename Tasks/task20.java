import java.util.Arrays;
import java.util.Random;

public class task20 {

	public static void main(String[] args) {
		Random random = new Random();
		int vardu_skaits = random.nextInt(10)+1;
		String vardi[] = new String[vardu_skaits];
		for (int i = 0; i < vardu_skaits; i++) {
			String vards = vards();
			vards = vards.length() > 2 ? vards.toUpperCase():vards;
			
			vardi[i] = vards;
		}
		System.out.println("Vârdu masîvs: " + Arrays.toString(vardi));

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

}
