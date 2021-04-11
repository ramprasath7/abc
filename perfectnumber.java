
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num <= 10000; num++) {
			// int num=6;
			int sum = 0;
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (num == sum) {
				System.out.println("pn" + num);
			}
		}
	}
}
