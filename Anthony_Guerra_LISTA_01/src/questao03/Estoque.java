package questao03;

public class Estoque {
	private Produto produto;
	private int qtdAtual;
	private int qtdMinima;
	
	
	
	public Estoque() {
		this.produto = null;
		this.qtdAtual = 0;
		this.qtdMinima = 0;
	}



	public Estoque(Produto produto, int qtdAtual, int qtdMinima) {
	
		this.produto = produto;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}



	public void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void reporEstoque(int qtd) {
		this.qtdAtual += qtd;
	}
	
	public void darBaixa(int qtd) {
		this.qtdAtual -= qtd;
	}

	public void relatorio() {
		System.out.println("Relatorio-> "+ produto + " Quantidade minima: " + qtdMinima +"." +  " Quantidade atual: " + qtdAtual);
	}
}
