package ae_ordenaçao;
import java.util.Arrays;
import java.util.Scanner;

public class MoveImpostor {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String sequencia = a.nextLine();
		String[] durante = sequencia.split(" ");
		int array[] = new int[durante.length];
		for (int i = 0; i < durante.length; i++) {
			array[i] = Integer.valueOf(durante[i]);
		}
		
		return ;
		
	}
	
	public String moveimpostor(int[] array) {
		int k = 1;
		int indexImpostor = 0;
		while (k < array.length - 1) {
			if (array[k] < array[k - 1]) {
				indexImpostor = k;
				break;
			}
		}
		
		for (int i = 0; i < indexImpostor - 1; i++) {
			if (array[i] > array[indexImpostor] && array[indexImpostor] < array[i + 1] ) {
				int temp = array[i];
				array[i] = array[indexImpostor]; array[indexImpostor] = temp;
			}
		}
		
		return array.toString();
		
	}
}
