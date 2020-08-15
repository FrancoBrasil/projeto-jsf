package br.com.projetojsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBean") // controlador de página JSF
public class PessoaBean {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;

	public String mostrarNome() {
		return nomeCompleto = nome + " " + sobrenome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

}
