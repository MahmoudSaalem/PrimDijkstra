package controller;

import model.Graph;

public class Main {

	public static void main(String[] args) {
		int verticesPrim = 8;
		Graph primGraph = new Graph(verticesPrim);
		primGraph.addEdgeUndirected(0, 1, 1);
		primGraph.addEdgeUndirected(3, 1, 4);
		primGraph.addEdgeUndirected(2, 1, 6);
		primGraph.addEdgeUndirected(2, 4, 9);
		primGraph.addEdgeUndirected(5, 1, 7);
		primGraph.addEdgeUndirected(5, 6, 6);
		primGraph.addEdgeUndirected(4, 7, 2);
		primGraph.addEdgeUndirected(3, 7, 7);
		primGraph.addEdgeUndirected(6, 7, 5);
		System.out.println("Prim"+"\n");
		primGraph.printGraph();
		Prim prim = new Prim();
		prim.getPrimMST(primGraph);
		
		int verticesDijkstra = 8;
		Graph dijkstraGraph= new Graph(verticesDijkstra);
		dijkstraGraph.addEdgeDirected(0, 2, 3);
		dijkstraGraph.addEdgeDirected(2, 0, 6);
		dijkstraGraph.addEdgeDirected(1, 0, 9);
		dijkstraGraph.addEdgeDirected(0, 3, 8);
		dijkstraGraph.addEdgeDirected(2, 4, 5);
		dijkstraGraph.addEdgeDirected(4, 2, 3);
		dijkstraGraph.addEdgeDirected(4, 7, 6);
		dijkstraGraph.addEdgeDirected(6, 7, 4);
		dijkstraGraph.addEdgeDirected(3, 7, 7);
		dijkstraGraph.addEdgeDirected(3, 5, 3);
		dijkstraGraph.addEdgeDirected(5, 1, 6);
		dijkstraGraph.addEdgeDirected(5, 6, 6);
		dijkstraGraph.addEdgeDirected(6, 5, 9);
		System.out.println("\n"+"Dijkstra"+"\n");
		dijkstraGraph.printGraph();
		Dijkstra shortt= new Dijkstra();
		shortt.dijkstra(dijkstraGraph, 0);
	}
}
