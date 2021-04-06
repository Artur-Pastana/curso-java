
public class Main {

	public static void main(String[] args) {
		int x = 28;
		double y = 10.456876;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.printf("%.2f%n",y);
		System.out.printf("%.3f%n",y);
		System.out.printf("%.4f%n",y);
		System.out.println("Artur tem "+x+" Anos");
		System.out.printf("Artur tem %d anos",x);
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("a area = "+area);
		
		int a, c;
		a = 5;
		c = 2;
		
		double res = (double) a / c;
		
		c = (int) res;
		
		System.out.println(c);
		
		System.out.println(res);
		
		
	}

}
