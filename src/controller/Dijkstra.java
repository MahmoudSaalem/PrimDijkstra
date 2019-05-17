package controller;

import model.Graph;

public class Dijkstra { 

	private int vertices;
	private int[][] adjacencyMatrix;
	
    private int minDistance(int distance[], Boolean visitedSet[], int V) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int i = 0; i < V; i++) {
            if (visitedSet[i] == false && distance[i] <= min) {
                min = distance[i];
                min_index = i;
            }
        }
        return min_index;
    }

    private void printOutput(int distance[], int V) {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + "'s distance equals " + distance[i]);
        }
    }

    public void dijkstra(Graph graph, int source) {
    	adjacencyMatrix = graph.getAdjacencyMatrix();
    	vertices = graph.getVertices();
        System.out.println("Source is "+source);
        int distance[] = new int[vertices];
        Boolean visitedSet[] = new Boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            distance[i] = Integer.MAX_VALUE;
            visitedSet[i] = false;
        }
        distance[source] = 0;
        for (int count = 0; count < vertices - 1; count++) {
            int minIndex = minDistance(distance, visitedSet, vertices);
            visitedSet[minIndex] = true;
            for (int v = 0; v < vertices; v++) {
                if (!visitedSet[v] && adjacencyMatrix[minIndex][v] != 0
                        && distance[minIndex] != Integer.MAX_VALUE && distance[minIndex] + adjacencyMatrix[minIndex][v] < distance[v]) {
                    distance[v] = distance[minIndex] + adjacencyMatrix[minIndex][v];
                }
            }
        }
        printOutput(distance, vertices);
    }
}
