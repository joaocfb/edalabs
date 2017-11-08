package ae_ordenaçao;

import java.util.Arrays;
import java.util.Scanner;

public class Estrategia_Hoare {
	private static int[] array;
	private static Estrategia_Hoare strategy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor_usuario = sc.nextLine();
		sc.close();
		strategy = new Estrategia_Hoare();
		int[] temp = strategy.transformaStrInt(valor_usuario);
		Estrategia_Hoare.hoare_partition(temp, 0, temp.length - 1);
	}
	
	private static void hoare_partition(int[] array, int firstIndex, int lastIndex) {
		int pivot = array[firstIndex];
		int i = firstIndex - 1;
		int j = lastIndex + 1;
		while(true) {
			do { i++; } while(array[i] < pivot);
			do {j --; } while(array[j] > pivot);
			if (i < j) swap(array, i, j);
			else {
				System.out.println(Arrays.toString(array));
				break;
				}
			}
		}
		
		
	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
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
