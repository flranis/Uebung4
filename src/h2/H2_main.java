package h2;

public class H2_main {
	public static void main(String[] args) {

		boolean x = false;
		boolean y = false;
		boolean a = false;
		boolean b = false;
		boolean c = false;
		int input = 11;

		if (input == 10 || input == 11) {
			x = true;
		} else {
			x = false;
		}

		if (input == 1 || input == 11) {
			y = true;
		} else {
			y = false;
		}

		if (x == true && y == true) {
			a = true;
		} else {
			a = false;
		}

		if ((x == true) || (x ^ y)) {
			b = true;
		} else {
			b = false;
		}

		if ((x == true && y == false) || (x == false && y == false)) {
			c = true;
		} else if ((x == true && y == true) || (x == false && y == true)) {
			c = false;
		}

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}
