package ae_ordenaçao;

public class Pair {
	
	private int chave;
	private String valor;
	
	public Pair(int chave, String valor) {
		this.setChave(chave);
		this.setValor(valor);
	}
	
	public void setChave(int chave) { this.chave = chave; }
	public int getChave() { return this.chave; }
	public void setValor(String valor) { this.valor = valor; }
	public String getValor() { return this.valor; }
	
}
