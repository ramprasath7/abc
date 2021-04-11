
public class recursion {

	void m (int p)
	{
		System.out.println(p);
		p++;
		if(p<=100)
		{
			m(p);
		}
		}
public static void main(String[] args) {
	recursion a=new recursion ();
	a.m(1);
	}
	
		
	}
	

