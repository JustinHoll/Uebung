
public class Uebung {

	public static void main(String[] args) {
					
			byte b = 42;

			short s = 42;

			int i = 42;

			long l = 42L;

			System.out.println(b);

			System.out.println(s);

			System.out.println(i);
			
			System.out.println(l);

			System.out.println(Byte.MIN_VALUE);

			System.out.println(Byte.MAX_VALUE);

			System.out.println(Short.MIN_VALUE);

			System.out.println(Short.MAX_VALUE);

			System.out.println(Integer.MIN_VALUE);

			System.out.println(Integer.MAX_VALUE);

			System.out.println(Long.MIN_VALUE);

			System.out.println(Long.MAX_VALUE);
			
			System.out.println('A');
			
			System.out.println('\ud9ad');
			
			System.out.println(17 + 4 * 2);

			System.out.println((17 + 4) * 2);
			
			System.out.println(17 / 3);

			System.out.println(17 % 3);

			System.out.println(17/ (1-1));
			
			System.out.println(Integer.MAX_VALUE);

			System.out.println(Integer.MAX_VALUE+1);
			
			System.out.println(l+l < 42);

			System.out.println(l+l <= 42);

			System.out.println(l+l> 42);

			System.out.println(l+l >= 42);

			System.out.println(l+l == 42);

			System.out.println(l+l != 42);
			
			System.out.println((17+4)*2==42?"tatsaechlich gleich":"unterschiedlich");
			
			System.out.println("signum(42) = ");

			System.out.println((42>0)?1: ((42<0)?-1:0));
			
			System.out.println(true && false);

			System.out.println(true || false);

			System.out.println(!true || false);

			System.out.println(true || true && false);
			
			System.out.println(quadrat(5));

			System.out.println(quadrat(10));

			System.out.println(quadrat(0));

			System.out.println(quadrat(-12));
			
			System.out.println(doppelt(quadrat(5)));
			
			System.out.println(summeDerQuadrate(3,4));
			
			System.out.println("signum(42) = "+ signum(42));

			System.out.println("signum(-42) = "+ signum(-42));
			System.out.println(positiv(6) && positiv(5));

			System.out.println(positiv(6) || positiv(5));

			System.out.println(positiv(-6) && positiv(5));

			System. out .println (positiv (-6)|| positiv(5) );

			System.out.println(positiv(6) & positiv(5));

			System.out.println(positiv(6) | positiv(5));

			System.out.println(positiv(-6) & positiv(5));

			System.out.println(positiv(-6)|| positiv(5));
					
			printNumber(1);

			printNumber(17+4);

			printNumber((17+4)*2);
			
			halloNerver();
			
			halloZaehler(1);
			
			countDown(10);
			
			System.out.println("fac(5) = "+fac(5));
			
			int x=0;

			System.out.println("x "+x);

			x=2;

			System.out.println("x "+x);

			x=x*x;

			System.out.println("x "+x);
			
		}
		
		static int fac(int i) {
			return i==0?1:i*fac(i-1);
		}
		static String countDown(int i) {
			System.out.println("hallo "+i);

			System.out.print(i==0?"":countDown(i-1));

			return "";

		}
		static void halloZaehler(int i) {
			System.out.println("hallo "+i);
			halloZaehler(i+1);
		}		
		static void halloNerver() {
			System.out.println("hallo");
			halloNerver();
		}
		static void printNumber(int x) {
			System.out.println(x);
		}
		static int quadrat(int x){
			return x*x;
		}
		static int doppelt(int x){
			return x+x;
		}
		static int summeDerQuadrate(int x, int 
				y){
			return quadrat (x)+quadrat(y);
		}
		static int signum(int i) {
			return (i>0)?1: ((i<0)?-1:0);
			}
		static boolean positiv(int x) {
			System.out.println("teste ob "+x+" positiv ist.");
			return x>0;
			}

}
