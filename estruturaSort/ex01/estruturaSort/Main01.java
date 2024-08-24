package estruturaSort;

import br.biblioteca.sorts.*;

public class Main01 {

	public static void main(String[] args) {
		Bubble b = new Bubble(); 
		Merge m = new Merge();
		
		int vetor[] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		for(int a: vetor) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		//b.Bubble(vetor);
		m.merge(vetor, 0, vetor.length-1);
		
		for(int a: vetor) {
			System.out.print(a + " ");
		}
	}

}
