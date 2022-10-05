package questao02;

import java.util.Objects;

public class Gerente extends Funcionario {
	private String area;

	public Gerente(String nome, String dataNascimento, double salario, String area) {
		super(nome, dataNascimento, salario);
		this.area = area;
	}

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		this.calcularImpostoDevido();
		return "Gerente [nome = " +nome+ ", dataNascimento = "+dataNascimento+", area= " + area +", salario= R$" + salario
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
		Gerente other = (Gerente) obj;
		return Objects.equals(area, other.area);
	}

}
