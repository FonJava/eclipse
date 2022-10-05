package questao03;

public class Produto {
	private int codigo;
	private String nome;
	
	public Produto() {
		this.codigo = 0;
		this.nome = " ";
	}
	
	public Produto(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		
		
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto: "+ nome + ", de codigo: " + codigo+".";
	}
	
	
	
	
}
