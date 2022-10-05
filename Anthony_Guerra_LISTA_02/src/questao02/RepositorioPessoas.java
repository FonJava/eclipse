package questao02;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioPessoas {
	private ArrayList<Cliente> clientes;
	private ArrayList<Pessoa> pessoas;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Gerente> gerentes;
	private ArrayList<Pessoa> maioresIdade = null;
	private ArrayList<Cliente> clientesMaiores = null;
	private ArrayList<Funcionario> funcSalMaiorQue = null;
	private ArrayList<Gerente> gerMesmaArea = null;

	public RepositorioPessoas(int capacidadeInicial) {
		this.pessoas = new ArrayList<>(capacidadeInicial);
		this.funcionarios = new ArrayList<>(capacidadeInicial);
		this.gerentes = new ArrayList<>(capacidadeInicial);
		this.maioresIdade = new ArrayList<>(capacidadeInicial);
		this.clientesMaiores = new ArrayList<>(capacidadeInicial);
		this.funcSalMaiorQue = new ArrayList<>(capacidadeInicial);
		this.gerMesmaArea = new ArrayList<>(capacidadeInicial);
		this.clientes = new ArrayList<>(capacidadeInicial);
	}

	public boolean CadastrarPessoa(Pessoa c) {
		boolean resultado = false;
		if (c != null) {

			boolean existePessoaIgual = false;
			for (Pessoa interna : pessoas) {
				if (interna.equals(c)) {
					existePessoaIgual = true;
				}
			}
			if (!existePessoaIgual) {
				this.pessoas.add(c);
				resultado = true;
			}
		}
		return resultado;
	}

	public ArrayList<Pessoa> listarPessoasMaioresIdade() {
		LocalDate ldNow = LocalDate.now();
		for (int i = 0; i < pessoas.size(); i++) {
			Duration diferencaDias = Duration.between(pessoas.get(i).getDataNascimento().atStartOfDay(),
					ldNow.atStartOfDay());
			if (diferencaDias.toDays() / 365 > 6570) {
				this.maioresIdade.add(pessoas.get(i));
			}
		}
		return maioresIdade;
	}

	@Override
	public String toString() {
		return "RepositorioPessoas [maioresIdade=" + maioresIdade + "\n" + "\n" + ", clientesMaiores=" + clientesMaiores
				+ "\n" + "\n" + ", funcSalMaiorQue=" + funcSalMaiorQue + "\n" + "\n" + ", gerMesmaArea=" + gerMesmaArea
				+ "\n" + "\n" + "]";
	}
	
	public ArrayList<Cliente> criarListaClientes() {
		Cliente obj = new Cliente();
		Class<? extends Cliente> a = obj.getClass();
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getClass() == a) {
				this.clientes.add((Cliente) pessoas.get(i));
			}
		}
		return clientes;
	}

	public ArrayList<Cliente> listarClientesMaioresIdade() {
		this.criarListaClientes();
		LocalDate ldNow = LocalDate.now();
		for (int i = 0; i < clientes.size(); i++) {
				Duration diferencaDias = Duration.between(clientes.get(i).getDataNascimento().atStartOfDay(),
						ldNow.atStartOfDay());
				if (diferencaDias.toDays() / 365 > 6570) {
					this.clientesMaiores.add((Cliente) clientes.get(i));
				
			}
		}
		return clientesMaiores;
	}

	public ArrayList<Funcionario> criarListaFuncionarios() {
		Funcionario obj = new Funcionario();
		Class<? extends Funcionario> a = obj.getClass();
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getClass() == a) {
				this.funcionarios.add((Funcionario) pessoas.get(i));
			}
		}
		return funcionarios;
	}

	public ArrayList<Funcionario> listarFuncionariosComSalarioMaiorQue(double salario) {
		this.criarListaFuncionarios();
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getSalario() > salario) {
				this.funcSalMaiorQue.add(funcionarios.get(i));
			}
		}
		return funcSalMaiorQue;
	}

	public ArrayList<Gerente> criarListaGerentes() {
		Gerente obj = new Gerente();
		Class<? extends Gerente> a = obj.getClass();
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getClass() == a) {
				this.gerentes.add((Gerente) pessoas.get(i));
			}
		}
		return gerentes;
	}

	public ArrayList<Gerente> listarGerentesDaArea(String area) {
		this.criarListaGerentes();
		for (int i = 0; i < gerentes.size(); i++) {
			if (gerentes.get(i).getArea().equals(area)) {
				this.gerMesmaArea.add(gerentes.get(i));
			}
		}
		return gerMesmaArea;
	}

}