package entities.enums;

public enum TipoDeDocumento {
	RG("Registro geral"),
	CPF("Cadastro de Pessoa Física"),
	CNPJ("Cadastro de Pessoa Jurídica");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private TipoDeDocumento(String descricao) {
		this.descricao = descricao;
		
	}
	
	
}
