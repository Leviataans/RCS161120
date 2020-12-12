import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		boolean atkartot = true;
		Scanner sc = new Scanner(System.in);
		
		while (atkartot) {
			System.out.print("Lûdzu ievadiet skaitli: ");
			int skaitlis = sc.nextInt();
			
			if (skaitlis > 0) {
        		System.out.print("0");
        		for (int i = 1; i <= skaitlis; i++) {
        			System.out.print(", " + i);
        		}
        	} else {
        		for (int i = skaitlis; i < 0; i++) {
        			System.out.print(i + ", ");
        		}
        		System.out.print(0);
        	}
			System.out.println();
			System.out.println("Vçlaties atkârtot? True/False: ");
			atkartot = sc.nextBoolean();
			
		}
		sc.close();

	}

}
