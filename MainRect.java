package Findrect;
public class MainRect {
	
	public static void main(String[] args) {
		

		
		rect A = new rect();
		rect B = new rect ();
		rect C = new rect ();
		rect D = new rect ();
		

		
	//	System.out.println("the value of a : " + A.a +" the value of b : "+ A.b);
		
		
		int j = (A.a - B.a);
		int k = (A.b - B.b);
		double j1 = Math.pow(j, 2);
		double k1 = Math.pow(k, 2);
		double wAB =  Math.sqrt(j1+k1);
		//System.out.println("the width of the rect is : "+ wAB);
		
		int l = (B.a - C.a);
		int m = (B.b - C.b);
		double l1 = Math.pow(l, 2);
		double m1 = Math.pow(m, 2);
		double lBC =  Math.sqrt(l1+m1);
		//System.out.println("the width of the rect is : "+ lBC);
		
		int n = (C.a - D.a);
		int p = (C.b - D.b);
		double n1 = Math.pow(n, 2);
		double p1 = Math.pow(p, 2);
		double wCD =  Math.sqrt(n1+p1);
		//System.out.println("the width of the rect is : "+ wCD);
		
		int q = (A.a - D.a);
		int r = (A.b - D.b);
		double q1 = Math.pow(q, 2);
		double r1 = Math.pow(r, 2);
		double lAD =  Math.sqrt(q1+r1);
		//System.out.println("the width of the rect is : "+ lAD);
		
		
		if (wAB == wCD && lBC==lAD)
		{
			double area  = lAD*wAB;
			System.out.println(" the  area of rect is : "+area);
		}
		else 
		{
			System.err.println("this is not a rect ");
		}
	}

}
