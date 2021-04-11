/**
 * 
 */

/**
 * @author sushma
 *
 */
public class printonlyeventnumber {

	/**
	 * 
	 */
	public printonlyeventnumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 4, 5, 6 };
		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

	}

}
