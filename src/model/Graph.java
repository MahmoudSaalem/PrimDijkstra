package model;

public class Graph {

	private int vertices;
	public int[][] adjacencyMatrix;
	
	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyMatrix = new int[vertices][vertices];
		initializeGraph(adjacencyMatrix);
	}
	
	private void initializeGraph(int[][] adjacencyMatrix) {
		for (int u = 0; u < vertices; u++) {
			for(int v = 0; v < vertices; v++) {
				adjacencyMatrix[u][v] = 0;
			}
		}
	}
	
	public void addEdge(int src, int dest, int weight) {
		// Because the graph is undirected
		adjacencyMatrix[src][dest] = weight;
		adjacencyMatrix[dest][src] = weight;
	}
	
	public void printGraph() {
		System.out.println("Tree adjacency matric representation");
		for (int u = 0; u < vertices; u++) {
			for(int v = 0; v < vertices; v++) {
				System.out.print(adjacencyMatrix[u][v] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
