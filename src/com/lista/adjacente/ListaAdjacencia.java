package com.lista.adjacente;

public class ListaAdjacencia {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
        
		Vertice _1 = grafo.addVertice("1");
		Vertice _2 = grafo.addVertice("2");
		Vertice _3 = grafo.addVertice("3");
		Vertice _4 = grafo.addVertice("4");
		Vertice _5 = grafo.addVertice("5");
		Vertice _6 = grafo.addVertice("6");
		Vertice _7 = grafo.addVertice("7");
		Vertice _8 = grafo.addVertice("8");
		Vertice _9 = grafo.addVertice("9");
		
	    Aresta _13 = grafo.addAresta(_1, _3);
	    Aresta _14 = grafo.addAresta(_1, _4);
	    
	    Aresta _24 = grafo.addAresta(_2, _4);
	    
	    Aresta _34 = grafo.addAresta(_3, _4);
	    Aresta _36 = grafo.addAresta(_3, _6);
	    
	    Aresta _69 = grafo.addAresta(_6, _9);
	    
	    Aresta _76 = grafo.addAresta(_7, _6);
	    Aresta _78 = grafo.addAresta(_7, _8);
	    
	    Aresta _89 = grafo.addAresta(_8, _9);
        
        System.out.println(grafo);
	}

}
