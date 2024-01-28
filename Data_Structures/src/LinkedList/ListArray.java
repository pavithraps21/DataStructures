package LinkedList;
import java.util.ArrayList;
import java.util.List;

class Graph2 {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    // Constructor
    public Graph2(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);

        // Loop for the number of vertices
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        // Undirected graph
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Method for printing the graph
    public void graphPrint() {
        System.out.println("Graph: ");

        // Loop for checking the adjacency with nearby vertices
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");

            // Enhanced for loop for encapsulation
            for (Integer neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

// Main class
public class ListArray {

    public static void main(String[] args) {
        // Object for subclass Graph
        Graph2 graph = new Graph2(5);
        
        // Edges
        graph.addEdge(1, 3);
        graph.addEdge(0, 2);
        graph.addEdge(1, 4);
        graph.addEdge(0, 4);
        graph.addEdge(2, 3);

        // Invoking the graph method
        graph.graphPrint();
    }
}
