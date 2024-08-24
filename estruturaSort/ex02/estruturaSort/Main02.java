package estruturaSort;

import br.biblioteca.sorts.*;

public class Main02 {

	public static void main(String[] args) {
		Bubble b = new Bubble(); 
		Merge m = new Merge();

		int vetor[] = {44, 43, 42, 41, 40, 39, 38};
		
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
