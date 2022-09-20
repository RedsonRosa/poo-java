package poo;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	
	private LocalDate dataNasc;
	
	public String getNome() {
		return nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	private Long cpf; 
}
