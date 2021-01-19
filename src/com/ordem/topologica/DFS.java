package com.ordem.topologica;

import java.util.ArrayList;
import java.util.List;

import com.lista.adjacente.*;

public class DFS {
	// private List<Vertice> vertices;
	private Integer cont;
	private String resultado;
	
	public DFS() {
		// this.vertices = new ArrayList<Vertice>();
		this.cont = 0;
		this.resultado = "";
	}
	
	public void buscaDFS(Vertice vertice){
		resultado += "---------------------------------\n";
		resultado += "DFS(" + vertice.getNome() + ")\n";
		
		cont += 1;
		
//		switch (vertice.getCor()) {
//		case "b": 
//			vertice.setCor("c");
//			break;
//		case "c": 
//			vertice.setCor("p");
//			break;
//		default:
//			break;
//		}
		
		
		if (vertice.gettInicial() != 0) {
			vertice.settFinal(cont);
		} else {
			vertice.settInicial(cont);
		}

		/*
		if (vertice.getPi() == null) {
			resultado += "Antecessor: \n";
		} else {
			resultado += "Antecessor: " + vertice.getPi().getNome() + "\n";
		}
		*/
		
//		resultado += "Cor: " + vertice.getCor() + "\n";
		resultado += "Tempo Inicial: " + vertice.gettInicial() + "\n";
		resultado += "Tempo Final: " + vertice.gettFinal() + "\n";
		
		if (!vertice.getAdjacencias().isEmpty()) {
			vertice.getAdjacencias().forEach(verticeAdj -> {
				buscaDFS(verticeAdj.getDestino());
			});
		} else if(vertice.getPi() != null){
			buscaDFS(vertice.getPi());
		}
		
//		vertice.getAdjacencias().forEach(verticeAdj -> {
////			buscaDFS(verticeAdj.getDestino());
//			
//			if(verticeAdj.getDestino() != null)
//				buscaDFS(verticeAdj.getDestino());
//			else if(verticeAdj.getDestino() == null && verticeAdj.getDestino().getPi() != null)
//				buscaDFS(verticeAdj.getDestino().getPi());
//			
//			
////			if(verticeAdj.getDestino().getCor() == "b") {
////				verticeAdj.getDestino().setPi(vertice);
////				
////				buscaDFS(verticeAdj.getDestino());
////			}
//		});
		
		/*
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
		*/
	}

	public void classificaVertices(Grafo grafo) {
		grafo.getVertices().forEach(vertice -> {
			boolean isFonte = vertice.getPi() == null && !vertice.getAdjacencias().isEmpty();
			boolean isSumidouro= !(vertice.getPi() == null) && vertice.getAdjacencias().isEmpty();
			
			if (isFonte)
				vertice.setClassificacao(0);
			else if (isSumidouro) 
				vertice.setClassificacao(1);
		});
	}
	
	public String toString() {
		return resultado;
	}
}
