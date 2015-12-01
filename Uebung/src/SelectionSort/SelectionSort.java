package SelectionSort;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		Random rand = new Random();
		int  n = rand.nextInt(50) + 2;
		
		int[] numb = new int[n];
		
		for (int i = 0; i < n; i++) {
			numb[i] = rand.nextInt(40);
		}
		
		
		
		int min;
		int cache;
		
		for (int i = 0; i < numb.length; i++) {
			min = i;
			for (int j = i+1; j < numb.length; j++) {
				if(numb[j] <= numb[min]){
					min = j;
				}
			}
			cache = numb[min];
			numb[min] = numb[i];
			numb[i] = cache;
			
		}
		
		for (int i : numb) {
			System.out.println(i);
		}
	}
	
	
	

}
