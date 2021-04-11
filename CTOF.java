package Packone;

public class CTOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 1000000;
		double n = 5;
		double r = 6.75;
		double ci = (p * (Math.pow((1 + r / 100), n))) - p;
		System.out.println(ci);
	}

}
