package com.lista.adjacente;

public class Aresta {
	private Vertice destino;

    Aresta(Vertice destino) {
        this.destino = destino;
    }

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}
    
    
}