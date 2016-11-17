package estado;

public class Estado {
	
	private String nome;
	private String transicaoZero;
	private String transicaoUm;
	
	
	public Estado(String nome, String transicaoZero, String transicaoUm) {
		super();
		this.nome = nome;
		this.transicaoZero = transicaoZero;
		this.transicaoUm = transicaoUm;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getTransicaoZero() {
		return transicaoZero;
	}
	public void setTransicaoZero(String transicaoZero) {
		this.transicaoZero = transicaoZero;
	}
	public String getTransicaoUm() {
		return transicaoUm;
	}
	public void setTransicaoUm(String transicaoUm) {
		this.transicaoUm = transicaoUm;
	}
	
	@Override
	public String toString() {
		return "Linha [nome=" + nome + ", transicaoZero=" + transicaoZero + ", transicaoUm="
				+ transicaoUm + "]";
	}
}
