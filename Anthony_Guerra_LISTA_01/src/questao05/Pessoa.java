package questao05;

import java.time.Duration;
import java.time.LocalDate;

public class Pessoa {
	private String cpf;
	private String grupo;
	private LocalDate dataNascimento;
	private int idade;
	private String nome;
	private LocalDate data2Dose;
	
	public Pessoa() {
		this.cpf = null;
		this.grupo = null;
		this.dataNascimento = null;
	}
	public Pessoa(String nome ,String cpf, LocalDate data2Dose) {
		this.cpf = cpf;
		this.data2Dose = data2Dose;
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	

	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int calcularIdade() {
		LocalDate ldNow = LocalDate.now();
		Duration tempo = Duration.between(this.dataNascimento.atStartOfDay(), ldNow.atStartOfDay());
		this.idade = (int) tempo.toDays()/365;

		return idade;
	}
}
