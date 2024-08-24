package estruturaSort;

import br.biblioteca.sorts.*;

public class Ex03 {

	public static void main(String[] args) {
		Bubble b = new Bubble(); 
		Merge m = new Merge();

		int vetor[] = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
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
