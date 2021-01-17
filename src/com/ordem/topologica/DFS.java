package com.ordem.topologica;

import java.util.ArrayList;
import java.util.List;

import com.lista.adjacente.*;

public class DFS {
	private List<Vertice> vertices;
	private Integer cont;
	private boolean isAdj;
	private String resultado;
	
	public DFS() {
		this.vertices = new ArrayList<Vertice>();
		this.cont = 0;
		this.isAdj = false;
		this.resultado = "";
	}
	
	public void buscaDFS(Vertice vertice){
		resultado += "---------------------------------\n";
		resultado += "DFS(" + vertice.getNome() + ")\n";
		
		cont += 1;
		
		switch (vertice.getCor()) {
		case "b": 
			vertice.setCor("c");
			break;
		case "c": 
			vertice.setCor("p");
			break;
		default:
			break;
		}
		
		
		if (vertice.gettInicial() != 0) {
			vertice.settFinal(cont);
		} else {
			vertice.settInicial(cont);
		}

		if (vertice.getPi() == null) {
			resultado += "Antecessor: \n";
		} else {
			resultado += "Antecessor: " + vertice.getPi().getNome() + "\n";
		}
		
		resultado += "Cor: " + vertice.getCor() + "\n";
		resultado += "Tempo Inicial: " + vertice.gettInicial() + "\n";
		resultado += "Tempo Final: " + vertice.gettFinal() + "\n";
		
		
		if (vertice.getAdjacencias().isEmpty() && vertice.getPi().getCor() != "p") {
			buscaDFS(vertice.getPi());
		} else {
			vertice.getAdjacencias().forEach((verticeAdj) -> {
				if(verticeAdj.getDestino().getCor() == "b") {
					verticeAdj.getDestino().setPi(vertice);
					
					buscaDFS(verticeAdj.getDestino());
				}
			});
		}
	}

	
	public String toString() {
		return resultado;
	}
}
