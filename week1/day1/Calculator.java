package week1.day1;

public class Calculator {

	public int add1(int a, int b) {
		return(a+b);

	}
	
    public int add2(int d, int e, int f) {
		return(d+e+f);

	}
	
    public int multiply1(int g, int h) {
		return (g*h);

	}
    
    public double multiply2(int i, double j) {
		return(i*j);

	}
    
    public int subtract1(int k, int l) {
    	return(k-l);

	}
    
    public double subtract2(double m, double n) {
    	return(m-n);

	}
    
    public int divide1(int o, int p) {
    	return(o/p);

	}
    
    public double divide2(double q, int r) {
    	return(q/r);

	}
    
    
    public static void main(String[] args) {
    	
		Calculator c1 = new Calculator();
		
		int resultAdd1 = c1.add1(25, 25);
		System.out.println(resultAdd1);
		
		int resultAdd2 = c1.add2(15, 15, 15);
		System.out.println(resultAdd2);
    	
		int resultMul1 = c1.multiply1(10, 70);
		System.out.println(resultMul1);
		
		double resultMul2 = c1.multiply2(50, 3100.5568);
		System.out.println(resultMul2);
		
		int resultSub1 = c1.subtract1(100, 25);
		System.out.println(resultSub1);
		
		double resultSub2 = c1.subtract2(4700.955, 3700.455);
		System.out.println(resultSub2);
		
		int resultdiv1 = c1.divide1(300, 50);
		System.out.println(resultdiv1);
		
		double resultdiv2 = c1.divide2(3000.500, 100);
		System.out.println(resultdiv2);
		
	}
    
}
