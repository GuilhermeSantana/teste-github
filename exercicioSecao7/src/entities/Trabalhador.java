package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalho;

public class Trabalhador {

	private String nome;
	private NivelTrabalho nivel;
	private Double baseSalario;

	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelTrabalho nivel, Double baseSalario, Departamento departamento) {

		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContrato() {
		return contratos;
	}

	public void setContrato(List<HorasContrato> contrato) {
		this.contratos = contrato;
	}

	public void adicionarContratos(HorasContrato contrato) {
		contratos.add(contrato);
	}

	public void removerContratos(HorasContrato contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double soma = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (HorasContrato c : contratos) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
