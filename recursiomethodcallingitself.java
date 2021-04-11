
public class recursiomethodcallingitself {
	int a = 0, b = 1;

	void m(int i) {
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c;
		i++;
		if (i <=10) {
			m(i);
		}
	}

	public static void main(String[] args) {

		recursiomethodcallingitself a = new recursiomethodcallingitself();
		a.m(1);
	}
}
