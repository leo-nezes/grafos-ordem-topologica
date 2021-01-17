package com.lista.adjacente;

import java.util.ArrayList;
import java.util.List;


public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    
    private Vertice pi; 
    private String cor; 

    private Integer tInicial;
    private Integer tFinal;
	

    Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new ArrayList<Aresta>();
        this.pi = null;
        this.cor = "b";
        this.tInicial = 0;
        this.tFinal = 0;
    }

    void addAdjacencia(Aresta e) {
    	adjacencias.add(e);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getAdjacencias() {
		return adjacencias;
	}

	public void setAdjacencias(List<Aresta> adjacencias) {
		this.adjacencias = adjacencias;
	}

	public Vertice getPi() {
		return pi;
	}

	public void setPi(Vertice pi) {
		this.pi = pi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer gettInicial() {
		return tInicial;
	}

	public void settInicial(Integer tInicial) {
		this.tInicial = tInicial;
	}

	public Integer gettFinal() {
		return tFinal;
	}

	public void settFinal(Integer tFinal) {
		this.tFinal = tFinal;
	}
    
    
}
