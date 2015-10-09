
public class Fibonacci {
	public static void main(String[] args) {
		fib(10);
	}
	
	public static void fib(int durchgaenge){
		int zahl1 = 0;
		int zahl2 = 1;
		
		int x;
		int y;
		
		System.out.println(1);
		
		for (int i = 0; i < durchgaenge; i++) {
			System.out.println(zahl1 + zahl2);
			
			x = zahl2;
			y = zahl1 + zahl2;
			zahl1 = x;
			zahl2 = y;
			
		}
	}
}
