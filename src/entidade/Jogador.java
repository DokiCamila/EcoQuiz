package src.entidade;

import src.servico.Pontuacao;


public class Jogador {
	private String nome;
	private Pontuacao pontos;

	public Jogador(String nome, Pontuacao pontos){
		this.nome = nome;
		this.pontos = pontos;
	}
	public Jogador(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(){
		this.nome = nome;
	}

	public Pontuacao getpontos(){
		return pontos;
	}

	public void setpontos(){
		this.pontos = pontos;
	}



}