package latest;

import java.util.*;

class Graph {
	private Map<Integer, List<Integer>> adjacencyList;

	public Graph() {
		this.adjacencyList = new HashMap<>();
	}

	public void addVertex(int vertex) {
		adjacencyList.put(vertex, new ArrayList<>());
	}

	public void addEdge(int source, int destination) {
		// Add edge from source to destination
		adjacencyList.get(source).add(destination);

		// Add edge from destination to source (assuming undirected graph)
		adjacencyList.get(destination).add(source);
	}

	public void printGraph() {
		for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
			System.out.print(entry.getKey() + " -> ");
			for (Integer neighbor : entry.getValue()) {
				System.out.print(neighbor + " ");
			}
			System.out.println();
		}
	}
}

public class P164_Graph {
	public static void main(String[] args) {
		Graph graph = new Graph();

		// Adding vertices
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);

		// Adding edges
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);

		// Printing the graph
		System.out.println("Graph representation:");
		graph.printGraph();
	}
}
