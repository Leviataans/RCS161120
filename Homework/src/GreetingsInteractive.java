import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet savu vârdu: ");
		String name = sc.next();
		System.out.print("Ievadiet savu vecumu: ");
		String age = sc.next();
		sc.close();
		
		System.out.println("Sveiki, mani sauc "+name+" esmu "+age+" gadus jauns!");

	}

}
