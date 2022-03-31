package entities;

import java.util.ArrayList;
import java.util.Date;


public class Projeto {
	private String nome;
	private  Date dt_Inicio;
	private Date dt_Termino;	
	private ArrayList<Contratacao> listaContratacao = new ArrayList<Contratacao>();
	
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	};
	
	
	public boolean adicionarContratacao(Contratacao contratacao){
		if(contratacao != null && !listaContratacao.contains(contratacao)) {
			this.listaContratacao.add(contratacao);			
			return true;
		}
		
		return false;
	};
	
	
	public boolean removerContratacao(Contratacao contratacao){
		if(contratacao != null && listaContratacao.size() > 0 && !listaContratacao.contains(contratacao)) {
			this.listaContratacao.remove(contratacao);			
			return true;
		}
		
		return false;
	};
	
	public void listarContratacoes() {	
	 for(Contratacao c: this.listaContratacao) {
		 System.out.println(c.getFuncionario().getNome());
	 }

}
	}
