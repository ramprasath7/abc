
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 25;
		switch (1) {
		case 1:
			if (mark >= 0 && mark <= 49)
				System.out.println("fail");
		case 2:
			if (mark >= 50 && mark <= 74)
				System.out.println("pass");
		case 3:
			if (mark >= 75 && mark <= 100);
				System.out.println("pass with distingth");
		default:
			System.out.println("invalid mark");
		}
	}
}
