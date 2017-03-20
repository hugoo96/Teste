package model.cliente;


public class ClienteSetorPublico extends Cliente {
	private String nivelOrgao;//municipal,estadual,federal
	
	public ClienteSetorPublico(String nome, String telefone, String email, String cnpj, String nivelOrgao) {
		super(nome, telefone, email, cnpj);
		this.nivelOrgao = nivelOrgao;
	}

	public String getNivelOrgao() {
		return nivelOrgao;
	}

	public void setNivelOrgao(String nivelOrgao) {
		this.nivelOrgao = nivelOrgao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail=" + email + "\nCnpj: "+cnpj+"\nNivel do orgao: "+nivelOrgao;
	}
	
	
}
