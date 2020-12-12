import java.util.Scanner;

public class task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plânoto skolnieku skaits: ");
		int skolnieki = sc.nextInt();
		System.out.println("Plânoto testu skaits: ");
		int testi = sc.nextInt();
		int masivs[][] = new int[skolnieki][testi];
		System.out.println("Ievadiet " + skolnieki * testi + " skolnieku atzîmes: ");
		for (int i = 0; i < skolnieki; i++) {
			for (int j = 0; j < testi; j++) {
				masivs[i][j] = sc.nextInt();
			}
		}
		System.out.println("Dati ir ievietoti");
		for (int i = 0; i < skolnieki; i++) {
			System.out.print("Skolnieks Nr. "+(i+1)+" vidçjâ atzîme ir: ");
			float videja_atzime = 0;
			for (int j = 0; j < testi; j++) {
				videja_atzime += masivs[i][j]; 
			}
			System.out.println((float)Math.round((videja_atzime/3) * 100.0) / 100.0);
		}
		
		sc.close();

	}

}
