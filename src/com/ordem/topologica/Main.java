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
	    
	    dfs.classificaVertices(grafo);
	    grafo.getVertices().forEach(vertice -> {
//	    	System.out.println(vertice.getClassificacao() == 2 );
//	    	System.out.println(vertice.getClassificacao());
	    	
	    	
			if (vertice.getClassificacao() == 0 
					&& vertice.gettInicial() == 0
					&& vertice.gettFinal() == 0) {
				dfs.buscaDFS(vertice);
			}
		});
	    
	    System.out.println(dfs);
	}

}
