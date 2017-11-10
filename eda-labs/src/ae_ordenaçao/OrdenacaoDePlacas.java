package ae_ordenaçao;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class OrdenacaoDePlacas {
	private HashMap<String, Integer> placas;
	private int[] intTemp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// https://www.codingeek.com/algorithms/radix-sort-explanation-pseudocode-and-implementation/
	
	
	private HashMap<String, Integer> transformaStrInt(String valor) {
		String[] transformando = valor.split(",");
		//String strTemp[] = new String[transformando.length];
		int[] intTemp = new int[transformando.length];
		placas = new HashMap<>();
		
		
		
		for (int i = 0; i < transformando.length; i++) {
			String[] temp = transformando[i].split("-");
			placas.put(temp[0], Integer.parseInt(temp[1]));
		}
			
		return placas;
		
	}
	
	
	

}
