package questao02;

import java.util.Objects;

public class Funcionario extends Pessoa {
	private final double SALARIO_TETO_IMPOSTO = 5000.00;
	double imposto = 0;
	protected double salario;

	public Funcionario(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento);
		this.salario = salario;
	}

	public Funcionario() {
		super(nome, dataNascimento);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSALARIO_TETO_IMPOSTO() {
		return SALARIO_TETO_IMPOSTO;
	}

	@Override
	public String toString() {

		this.calcularImpostoDevido();
		return "Funcionario [nome= " + nome + ", dataNascimento= " + dataNascimento + ", salario= R$" + salario
				+ ", imposto devido = R$" + imposto + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	public double calcularImpostoDevido() {
		if (this.salario <= SALARIO_TETO_IMPOSTO) {
			this.imposto = this.salario * 0.05;
		} else if (this.salario > SALARIO_TETO_IMPOSTO) {
			this.imposto = this.salario * 0.075;
		}
		return this.imposto;
	}

}
