package ae_ordenaçao;

import java.util.Scanner;

public class VerificaDuplicados {
	private static VerificaDuplicados verifica;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String valor_usuario = sc.nextLine();
		sc.close();
		verifica = new VerificaDuplicados();
		int[] temp = verifica.transformaStrInt(valor_usuario);
		System.out.println(verifica.verificaDuplicados(temp));
		}

	
	public boolean verificaDuplicados(int[] array) {
		boolean has_repeted = false;
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] == array[j]) {
					has_repeted = true;
					return has_repeted;
				}
			}
		}
		return has_repeted;
	}
	
	
	private int[] transformaStrInt(String valor) {
		String[] transformando = valor.split(" ");
		int[] array = new int[transformando.length];
		
		for (int i = 0; i < transformando.length; i++) {
			array[i] = Integer.parseInt(transformando[i]);
		}
		
		return  array;
	}
}