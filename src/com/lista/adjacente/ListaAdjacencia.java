package com.lista.adjacente;

public class ListaAdjacencia {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
        Vertice s = grafo.addVertice("s");
        Vertice t = grafo.addVertice("t");
        Vertice y = grafo.addVertice("y");
        
        Aresta st = grafo.addAresta(s, t);
        Aresta sy = grafo.addAresta(s, y);
        Aresta ty = grafo.addAresta(t, y);
        Aresta yt = grafo.addAresta(y, t);
        
        System.out.println(grafo);
	}

}
