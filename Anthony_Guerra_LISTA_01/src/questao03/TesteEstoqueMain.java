package questao03;

public class TesteEstoqueMain {
public static void main(String[] args) {
	Produto produto01 = new Produto(1, "Teclado");
	Produto produto02 = new Produto(2, "Mouse");
	
	Estoque estoque01 = new Estoque(produto01, 20, 15);
	Estoque estoque02 = new Estoque(produto02, 30, 10);
	
	estoque01.darBaixa(10);
	estoque02.reporEstoque(19);
	estoque01.relatorio();
	System.out.println("\n");
	estoque02.relatorio();
	System.out.println("\n");
	produto01.mudarNome("Teclado Virtual");
	estoque01.relatorio();
}
}
