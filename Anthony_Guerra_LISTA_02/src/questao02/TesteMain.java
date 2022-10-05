package questao02;

public class TesteMain {
	public static void main(String[] args) {
		RepositorioPessoas rp1 = new RepositorioPessoas(100);
		Cliente c1 = new Cliente("ney", "1999-12-20", 9834);
		Cliente c2 = new Cliente("marcelo", "1972-12-20", 1834);
		Cliente c3 = new Cliente("cristiano", "1990-12-20", 2834);
		Cliente c4 = new Cliente("messi", "1991-12-20", 3834);
		Cliente c5 = new Cliente("kieza", "1989-12-20", 4834);
		
		rp1.CadastrarPessoa(c1);
		rp1.CadastrarPessoa(c2);
		rp1.CadastrarPessoa(c3);
		rp1.CadastrarPessoa(c4);
		rp1.CadastrarPessoa(c5);

		Cliente c6 = new Cliente("ney", "1999-12-20", 9834);
		rp1.CadastrarPessoa(c6);

		Funcionario f1 = new Funcionario("wenger", "1989-12-20", 9000);
		Funcionario f2 = new Funcionario("mourinho", "1962-12-20", 1800);
		Funcionario f3 = new Funcionario("lisca", "1970-12-20", 2800);;
		Funcionario f4 = new Funcionario("lautaro", "1961-12-20", 38000);
		Funcionario f5 = new Funcionario("pep", "1979-12-20", 4000);
	

		rp1.CadastrarPessoa(f1);
		rp1.CadastrarPessoa(f2);
		rp1.CadastrarPessoa(f3);
		rp1.CadastrarPessoa(f4);
		rp1.CadastrarPessoa(f5);

		Funcionario f6 = new Funcionario("wenger", "1989-12-20", 9000);
		rp1.CadastrarPessoa(f6);

		Gerente g1 = new Gerente("jose", "1998-12-20", 8340, "universidade");
		Gerente g2 = new Gerente("maria", "1971-12-20", 2000, "federal");
		Gerente g3 = new Gerente("cacadores", "1951-12-20", 3000, "rural");;
		Gerente g4 = new Gerente("dee", "1941-12-20", 6000, "de");
		Gerente g5 = new Gerente("bruxas", "1971-12-20", 4800, "pernambuco");
	

		rp1.CadastrarPessoa(g1);
		rp1.CadastrarPessoa(g2);
		rp1.CadastrarPessoa(g3);
		rp1.CadastrarPessoa(g4);
		rp1.CadastrarPessoa(g5);

		Gerente g6 = new Gerente("jose", "1998-12-20", 8340, "universidade");
		rp1.CadastrarPessoa(g6);

		rp1.listarClientesMaioresIdade();
		rp1.listarFuncionariosComSalarioMaiorQue(5000);
		rp1.listarGerentesDaArea("universidade");
		rp1.listarPessoasMaioresIdade();
		
		System.out.println(rp1);
	}
}