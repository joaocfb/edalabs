package ae_ordenaçao;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortRecursivo {
	private int[] array;
	private static SelectionSortRecursivo sort;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valorUsuario = sc.nextLine();
		sc.close();
		sort = new SelectionSortRecursivo();
		sort.selectionRecursivo(sort.transformaStrInt(valorUsuario), 0);

	}
	
	public int[] selectionRecursivo(int[] array, int indice) {
		
		if (indice == array.length - 1) {
			return array;
		}
		int temp, menorIndex = indice;
		
		for (int i = indice + 1; i < array.length; i++) {
			if (array[i] < array[menorIndex]) {
				menorIndex = i;
			}
		}
		temp = array[indice];
		array[indice] = array[menorIndex];
		array[menorIndex] = temp;
		System.out.println(Arrays.toString(array));
		return selectionRecursivo(array, indice + 1);
	}
	
	private int[] transformaStrInt(String valor) {
		String[] transformando = valor.split(" ");
		array = new int[transformando.length];
		
		for (int i = 0; i < transformando.length; i++) {
			array[i] = Integer.parseInt(transformando[i]);
		}
		
		return  array;
		
	}

}
