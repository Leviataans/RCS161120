import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ievadiet veselu skaitli: ");
		int number = sc.nextInt();
		System.out.print("Ievadiet decim�lskaitli: ");
		float fl = sc.nextFloat();
		
		sc.close();
		
		System.out.print("Skait�u number un fl summa ir: ");
		System.out.println(number+fl);
		System.out.print("Skait�u number un fl starp�ba ir: ");
		System.out.println(number-fl);
		System.out.print("Skait�u number un fl dal�jums ir: ");
		System.out.println(number/fl);
		System.out.print("Skait�u number un fl reizin�jums ir: ");
		System.out.println(number*fl);
		System.out.print("Skait�u number un fl summas kvadr�ts ir: ");
		System.out.println((number+fl)*(number+fl));

	}

}
