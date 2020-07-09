package java_sessions;

public class conditional_statements {
	

	static int finalBill;

	public static void main(String[] args) {

		int a = 40;
		int b = 40;

		// single if else
		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		// only one if
		if (a == b) {
			System.out.println("both are equal");
		}

		if (a >= b) {
			System.out.println("a is greater than or equal to b");
		}

		// < > <= >= == !=

		int total = 100;
		if (total != 500) {
			System.out.println("correct bill");
		}

		// dead code:
		if (!true) {
			System.out.println("PASS");
		} else {

			System.out.println("FAIL");
		}

		// nested IFs:
		int num = 20;
		if (num == 10) {
			if (num < 15) {
				System.out.println("num is smaller than 15");
			}
			if (num < 12) {
				System.out.println("num is smaller than 12 also..");
				//Map<String, Integer> map = new HashMap<String, Integer>();

			}
		} else {
			System.out.println("Bye!!");
		}

		// if elseif ladder statements:
		int number = 40;
		if (number == 10) {
			System.out.println("number is 10");
		} else if (number == 15) {
			System.out.println("number is 15");
		}

		else if (number == 20) {
			System.out.println("number is 20");
		}

		else {
			System.out.println("number is " + number + " not found....");
		}

		// WAP to find out the highest number where three numbers are given:
		int x = 500;
		int y = 600;
		int z = 400;

		if (x > y && x > z) {// false && true = false
			System.out.println("x is the highest number");
		}

		else if (y > z) {// true
			System.out.println("y is the highest number");
		}

		else {
			System.out.println("z is the highest number");
		}

		int billTotal = 900;

		if (billTotal >= 500) {// true
			finalBill = billTotal + 50;// 550
		}

		if (billTotal <= 100) {// false
			finalBill = billTotal + 10;
		}

		if (billTotal > 500 && billTotal <= 1000) {// true && true
			finalBill = billTotal + 100;
		}

		System.out.println("final bill is: " + finalBill);
	}

}
