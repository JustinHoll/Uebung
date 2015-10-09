
public class Collatz {
	public static void main(String[] args) {
		coll(19);
	}
	public static void coll(int number){
		if(number<0){
			System.out.println("Die Zahl muss größer als 0 sein!");
		}
		
		if(number%2 == 0 && number != 1){
			System.out.println(number);
			
			coll(number/2);
		}else if(number%2 != 0 && number != 1){
			System.out.println(number);
			
			coll(3*number+1);
		}else{
			System.out.println(1);
		}
		
	}
}
