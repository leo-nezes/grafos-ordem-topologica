package com.ordem.topologica;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import com.lista.adjacente.*;

public class DFS {
	private List<Vertice> listaVertices;
	
	private Integer cont;
	private String resultado;
	
	public DFS() {
		this.listaVertices = new ArrayList<Vertice>();
		
		this.cont = 0;
		this.resultado = "";
	}
	
	public void buscaDFS(Vertice vertice){
		cont += 1;
		
		resultado += "---------------------------------\n";
		resultado += "DFS(" + vertice.getNome() + ")\n";
		
		vertice.setCor("c");
		
		if (vertice.gettInicial() == 0) 
			vertice.settInicial(cont);
		
		resultado += "Tempo Inicial: " + vertice.gettInicial() + "\n";

		vertice.getAdjacencias().forEach(verticeAdj -> {
			if (verticeAdj.getDestino().getCor() == "b")
				buscaDFS(verticeAdj.getDestino());
		});
		
		vertice.setCor("p");
		vertice.settFinal(cont + 1);
		resultado += "Tempo Final: " + vertice.gettFinal() + "\n";
		
		listaVertices.add(vertice);
		
	}

	public void classificaVertices(Grafo grafo) {
		grafo.getVertices().forEach(vertice -> {
			boolean isFonte = vertice.getPi() == null;
			boolean isSumidouro= vertice.getPi() != null;
			
			if (isFonte)
				vertice.setClassificacao(0);
			else if (isSumidouro) 
				vertice.setClassificacao(1);
		});
	}
	
	public String toString() {
		Collections.sort(listaVertices, Collections.reverseOrder());
		
		resultado += "\n[";
		listaVertices.forEach(vertice -> {
			resultado += " ( Vertice: " + vertice.getNome() + ", Tempo Final: " 
						+ vertice.gettFinal() + ")";
		});
		resultado += " ]";
		
		return resultado;
	}
}
