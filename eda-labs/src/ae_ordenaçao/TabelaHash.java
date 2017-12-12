package ae_ordenaçao;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TabelaHash {
	//ArrayList<Pair> valores;
	ArrayList<ArrayList>[] tabela;
	
	public TabelaHash(int tamanho) {
		tabela = new ArrayList[tamanho];
	}
	
	public void put(int chave, String valor) {
		ArrayList<Pair> valores = null;
		Pair pares = new Pair(chave, valor);
		valores.add(pares);
		int hash = valorHash(chave);
		tabela[hash].add(valores);
		
	}

	public void remove(int chave) {
		int hash = valorHash(chave);
		tabela[hash].clear();
	}
	
	public void keys() {
		ArrayList keys;
		
		for (int i = 0; i < tabela.length; i++) {
				
		}
	}
	
	public void values() {
		
	}
	
	public int valorHash(int chave) {
		return chave % (tabela.length + 1);
	}
}
