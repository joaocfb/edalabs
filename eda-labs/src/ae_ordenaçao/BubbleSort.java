package ae_ordenaçao;

import java.util.Scanner;

public class BubbleSort {
	private int[] array;
	private static BubbleSort bubble;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valorUsuario = sc.nextLine();
		sc.close();
		bubble = new BubbleSort();
		bubble.Bubble(bubble.transformaString(valorUsuario));

	}
	
	public void Bubble(int[] array) {
			for (int i = array.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
				if (i > 1) toString(array);
			}
	}
	
	private void toString(int[] array) {
		String temp = "";
		for (int i = 0; i < array.length; i++) {
			if (i == 0 ) {
				temp += array[i];
			} else {temp += " " + array[i];}
		}
		System.out.println(temp);
	}
	
	private int[] transformaString(String valor) {
		String[] temp = valor.split(" ");
		array = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			array[i] = Integer.parseInt(temp[i]);
		}
		return array;
	}

}
