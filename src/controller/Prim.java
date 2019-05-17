package controller;

import model.Graph;

public class Prim {

	private int vertices;
	private int[] path;
	private int[] weight;
	private int[][] adjacencyMatrix;
	private boolean[] visited;
	
	public void getPrimMST(Graph graph) {
		initializePrim(graph);
		for (int i = 1, u; i < vertices; i++) {
			u = getMinWeigthIndex();
			visited[u] = true;
			for (int v = 0; v < vertices; v++) {
				if (adjacencyMatrix[u][v] != 0 && !visited[v] && adjacencyMatrix[u][v] < weight[v]) {
					path[v] = u;
					weight[v] = adjacencyMatrix[u][v];
				}
			}
		}
		printPrimMST();
	}
	
	private void initializePrim(Graph graph) {
		this.adjacencyMatrix = graph.getAdjacencyMatrix();
		this.vertices = graph.getVertices();
		path = new int[vertices];
		weight = new int[vertices];
		visited = new boolean[vertices];
		
		for (int i = 0; i < vertices; i++) {
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		weight[0] = 0;
		path[0] = -1;
	}
	
	private int getMinWeigthIndex() {
		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;
		
		for (int i = 0; i < vertices; i++) {
			if (!visited[i] && weight[i] < minValue) {
				minValue = weight[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	private void printPrimMST() {
		System.out.println("Prim's minimum spanning tree");
		System.out.println(" Edge \t Weight");
		for (int i = 1; i < vertices; i++) {
			System.out.println(i + " -- " + path[i] + " \t   " + adjacencyMatrix[i][path[i]]);
		}
	}
	
}
