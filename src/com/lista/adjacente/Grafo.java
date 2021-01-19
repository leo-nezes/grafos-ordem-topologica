package com.lista.adjacente;

import java.util.List;
import java.util.ArrayList;

public class Grafo {
	private List<Vertice> vertices;
	private List<Aresta> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    public Vertice addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    public Aresta addAresta(Vertice origem, Vertice destino) {
    	Aresta aresta = new Aresta(destino);
        origem.addAdjacencia(aresta);
        destino.setPi(origem);
        arestas.add(aresta);
        return aresta;
    }

    public String toString() {
        String r = "";
        for (Vertice vertice : vertices) {
            r += vertice.getNome() + " -> ";
            for (Aresta aresta : vertice.getAdjacencias()) {
                Vertice v = aresta.getDestino();
                r += v.getNome() + ", ";
            }
            r += "\n";
        }
        return r;
    }

	public List<Vertice> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
}