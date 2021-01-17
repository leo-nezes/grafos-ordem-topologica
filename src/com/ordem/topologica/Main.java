package com.ordem.topologica;

import com.lista.adjacente.*;

public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		DFS dfs = new DFS();
		
		Vertice a = grafo.addVertice("A");
	    Vertice b = grafo.addVertice("B");
	    Vertice c = grafo.addVertice("C");
	    
	    Aresta ab = grafo.addAresta(a, b);
	    Aresta ac = grafo.addAresta(a, c);
	    
	    dfs.buscaDFS(grafo.getVertices().get(0));
	    
	    System.out.println(dfs);
	}

}
