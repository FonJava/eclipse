package questao03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import questao02.Cliente;

public class FluxoCaixa  {
private String nomeEmpresa;
private String cnpj;
private ArrayList<Transacao> transacoes;
private double totalDespesas;
private double totalReceitas;
private double saldoAtual;
private double pDMes;
private double pRMes;
ArrayList<Transacoes> transacoesNoMes;
public FluxoCaixa(String nomeEmpresa, String cnpj) {
	this.nomeEmpresa = nomeEmpresa;
	this.cnpj = cnpj;
	this.transacoes = new ArrayList<>(500);
}
public String getNomeEmpresa() {
	return nomeEmpresa;
}
public void setNomeEmpresa(String nomeEmpresa) {
	this.nomeEmpresa = nomeEmpresa;
}
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public void adicionarTransacao(Transacao transacao) {
	Despesa a = new DespesaComAgua();
	 if(transacao.getClass() == a.getClass()) {
		 transacoes.add(transacao);
	 }
	 Despesa b = new DespesaComEnergia();
	 if(transacao.getClass() == b.getClass()) {
		 transacoes.add(transacao);
	 }
	 Despesa c = new DespesaComInternet();
	 if(transacao.getClass() == c.getClass()) {
		 transacoes.add(transacao);
	 }
	 
	 Receita d = new LicencaBasica();
	 if(transacao.getClass() == d.getClass()) {
		 transacoes.add(transacao);
	 }
	 Receita e = new LicencaPlus();
	 if(transacao.getClass() == e.getClass()) {
		 transacoes.add(transacao);
	 }
	 Receita f = new LicencaEnterprise();
	 if(transacao.getClass() == f.getClass()) {
		 transacoes.add(transacao);
	 }
}

public double calcularDespesas(LocalDate inicio, LocalDate fim) {
	double totalDespesas = 0;
	for (int i = 0; i < transacoes.size(); i++) {
		totalDespesas =transacoes.get(i).calcularTotal();
	}
	return totalDespesas;
}
public double calcularReceitas(LocalDate inicio, LocalDate fim) {
	double totalReceitas = 0;
	for (int i = 0; i < transacoes.size(); i++) {
		totalReceitas =transacoes.get(i).calcularTotal();
	}
	return totalReceitas;
}

private double percentualReceitasNoMes(int mes, int ano) {
	LocalDate dataMes = LocalDate.of(ano, mes, ano);
	this.calcularReceitas(dataMes, dataMes);
	return pRMes;
}
private double percentualDespesasNoMes(int mes, int ano) {
	LocalDate dataMes = LocalDate.of(ano, mes, ano);
	this.calcularDespesas(dataMes, dataMes);
	
	return pDMes;
}
private double saldoAtual() {
	this.calcularReceitas(null, null);
	this.calcularDespesas(null, null);
	return saldoAtual;
}
public ArrayList<Transacoes> listarTransacoesNoMes(int mes, int ano) {
	for (int i = 0; i < transacoes.size(); i++) {
		transacoesNoMes.add((Transacoes) transacoes.get(i));
	}
	
	return transacoesNoMes;
}
}
