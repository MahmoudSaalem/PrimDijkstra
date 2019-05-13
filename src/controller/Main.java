package controller;

import model.Graph;

public class Main {
    
    public static void main(String[] args) {
    	int vertices = 8;
		Graph graph = new Graph(vertices);
		graph.addEdge(0, 1, 1);
		graph.addEdge(3, 1, 4);
		graph.addEdge(2, 1, 6);
		graph.addEdge(2, 4, 9);
		graph.addEdge(5, 1, 7);
		graph.addEdge(5, 6, 6);
		graph.addEdge(4, 7, 2);
		graph.addEdge(3, 7, 7);
		graph.addEdge(6, 7, 5);
		
		graph.printGraph();
		Prim prim = new Prim();
		prim.getPrimMST(graph);
	}
    
}
