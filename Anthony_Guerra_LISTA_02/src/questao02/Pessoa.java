package questao02;

import java.time.LocalDate;
import java.util.Objects;

abstract class Pessoa {
	protected static String nome;
	protected static LocalDate dataNascimento;

	public Pessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = LocalDate.parse(dataNascimento);
	}

	public Pessoa(String nome2, LocalDate dataNascimento2) {
		// TODO Auto-generated constructor stub
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nome, other.nome);
	}

}
