package questao02;

import java.util.Objects;

public class Cliente extends Pessoa {

	private long codigo;

	public Cliente(String nome, String dataNascimento, long codigo) {
		super(nome, dataNascimento);
		this.codigo = codigo;
	}

	public Cliente() {
		super(nome, dataNascimento);
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return codigo == other.codigo;
	}

}
