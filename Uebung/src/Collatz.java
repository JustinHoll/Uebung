public class Collatz {
	public static void main(String[] args) {
		/*for (int i = 1; i <= 100; i++) {
			
			System.out.print("Collatz-Folge für Zahl "+i+" (");
			coll(i);
			System.out.print(")");
			System.out.println("");
		}*/
		
		coll(19);
		
	}
	public static void coll(int number){
		if(number<0){
			System.out.println("Die Zahl muss größer als 0 sein!");
		}
		
		if(number%2 == 0 && number != 1){
			System.out.print(number+" ");
			
			coll(number/2);
		}else if(number%2 != 0 && number != 1){
			System.out.print(number+" ");
			
			coll(3*number+1);
		}else{
			System.out.print(1);
		}
		
	}
}
