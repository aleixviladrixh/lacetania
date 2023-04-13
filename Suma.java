package Test;

import java.util.Scanner;

public class Suma {

	public static int fesSuma(int s1, int s2) {
		return s1 + s2;
	}

	public static int sumaString(String num1, String num2) {
		return fesSuma(Integer.parseInt(num1), Integer.parseInt(num2));
	}
	
	public static void main(String[] args) {
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Escriu dos números: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = fesSuma(a, b);
		System.out.println("La suma és: " + c);
		scan.close();
	}
}