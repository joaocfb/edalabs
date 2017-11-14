package ae_ordenaçao;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	private static CountingSort sort;
	
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String valorUsuario = sc.nextLine();
		int maiorElemento = sc.nextInt();
		sc.close();
		*/
		
		String valorUsuario = "3 1 1 6 4 7";
		int maiorElemento = 7;
		
		sort = new CountingSort();
		sort.counting(sort.transformaStrInt(valorUsuario), maiorElemento);
		
	}
	
	public void counting(int[] array,int maiorElemento) {
		
		int[] contagem = new int[maiorElemento + 1];
		int[] arrayOrdenado = new int[array.length];
		
	    int min = array[0];
	    int max = array[0];
	    for (int i = 1; i < array.length; i++) {
	      if (array[i] < min) {
	        min = array[i];
	      } else if (array[i] > max) {
	        max = array[i];
	      }
	    }
		
		for (int i = 0; i < array.length; i++) {
			contagem[array[i]] ++;
			System.out.println(toString(contagem));
		}
		
		
		for (int i = 1; i < contagem.length; i++) {
			contagem[i] += contagem[i - 1];
		}
		
		System.out.println("Cumulativa do vetor de contagem - " + toString(contagem));
		
		for (int i = array.length - 1; i >= 0; i--) {
			arrayOrdenado[contagem[array[i] - min] --] = array[i];
			contagem[array[i]] -- ;
		}
		
		System.out.println(toString(contagem));
		System.out.println(toString(arrayOrdenado));
		
	}
	
	
	private int[] transformaStrInt(String valor) {
		String[] transformando = valor.split(" ");
		int [] array = new int[transformando.length];
		
		for (int i = 0; i < transformando.length; i++) {
			array[i] = Integer.parseInt(transformando[i]);
		}
		
		return  array;
		
	}
	
	public String toString(int[] array) {
		String valorParaRetorno = "";
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == array.length) {
				valorParaRetorno += array[i];
			} else {
				valorParaRetorno += " " + array[i] + " ";
			}
		}
		
		return valorParaRetorno;
		
	}
	
}
