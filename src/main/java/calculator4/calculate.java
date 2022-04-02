package calculator4;

import java.util.Scanner;

public class calculate {

	public float add(float x, float y) {
		float z;
		z = x + y;
		return z;
	}

	public float sub(float x, float y) {
		float z;
		z = x - y;
		return z;
	}

	public float mul(float x, float y) {
		float z = x * y;
		return z;
	}

	public float div(float x, float y) {
		float z = x / y;
		return z;
	}

	public static void main(String[] args) {
		try {
			cal();
		} catch (Exception e) {
			System.out.println("----");
		}

	}

	public static void cal() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			float a, b;
			float c;
			System.out.println(
					"---------------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("Enter the first value-->");
			a = scan.nextFloat();
			System.out.println("Enter the secound value-->");
			b = scan.nextFloat();
			System.out.println("Enter the selection which oparation you want to perform-->");
			System.out.println("1 Addtion");
			System.out.println("2 Substraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Divition");
			int sel = scan.nextInt();
			while (sel > 4) {
				System.out.println("You select wrong operation to perform");
				System.out.println("Please select right choice");
				sel = scan.nextInt();
			}

			calculate cal = new calculate();
			switch (sel) {
			case 1:
				c = cal.add(a, b);
				System.out.println(c);
				break;
			case 2:
				c = cal.sub(a, b);
				System.out.println(c);
				break;
			case 3:
				c = cal.mul(a, b);
				System.out.println(c);
				break;
			case 4:
				c = cal.div(a, b);
				System.out.println(c);
				break;
			default:
				System.out.println("you enter invalid number");
				System.out.println("please select right choice");

			}

		}
	}

}
