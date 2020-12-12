import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ievadiet veselu skaitli: ");
		int number = sc.nextInt();
		System.out.print("Ievadiet decimâlskaitli: ");
		float fl = sc.nextFloat();
		
		sc.close();
		
		System.out.print("Skaitïu number un fl summa ir: ");
		System.out.println(number+fl);
		System.out.print("Skaitïu number un fl starpîba ir: ");
		System.out.println(number-fl);
		System.out.print("Skaitïu number un fl dalîjums ir: ");
		System.out.println(number/fl);
		System.out.print("Skaitïu number un fl reizinâjums ir: ");
		System.out.println(number*fl);
		System.out.print("Skaitïu number un fl summas kvadrâts ir: ");
		System.out.println((number+fl)*(number+fl));

	}

}
