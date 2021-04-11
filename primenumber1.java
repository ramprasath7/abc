
public class primenumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}for (int num = 1; num <= 1000; num++) {
		// int num = 48;

		int counter = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				counter = counter + 1;
			}
		}
		if (counter == 2) {
			System.out.println("pn" + num);
		} else {
			System.out.println("npn" + num);
		}
	}
}
}

}
