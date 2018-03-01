package by.htp.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcScanner {

	private Scanner scan = new Scanner(System.in);

	public CalcScanner() {

	}

	public String enterString() {
		String s = scan.next();
		return s;
	}

	public int enterInt() {
		int i = 0;
		try {
			i = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ќшибка: ¬ведено число не целого типа");
			System.exit(1);
		}
		return i;
	}

	public float enterFloat() {
		float i = 0;
		try {
			i = scan.nextFloat();
		} catch (InputMismatchException e) {
			System.out.println("ќшибка: ¬ведено число не вещественного типа");
			System.exit(1);
		}
		return i;
	}

}
