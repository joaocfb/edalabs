package ae_ordenaçao;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortStepByStep {
	private static SelectionSortStepByStep selecao;
	private static int [] array;
	
	public SelectionSortStepByStep() {
		}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String valorUsuario = sc.nextLine();
		sc.close();
		selecao = new SelectionSortStepByStep();
		int[] temp = selecao.transformaStrInt(valorUsuario);
		selecao.selectionSort(temp);
	}
	
	public void selectionSort(int[] lista) {
		int i, j, indexMinimo, temp;
		int lenghtLista = lista.length;

		for (i = 0; i < lenghtLista - 1; i++) {
			indexMinimo = i;
			
			for (j = i + 1; j < lenghtLista; j++)
				if (lista[j] < lista[indexMinimo])
					indexMinimo = j;
			
			if (indexMinimo != i) {
				temp = lista[i];
				lista[i] = lista[indexMinimo];
				lista[indexMinimo] = temp;
				System.out.println(Arrays.toString(lista));
			}
		}
		
		
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
