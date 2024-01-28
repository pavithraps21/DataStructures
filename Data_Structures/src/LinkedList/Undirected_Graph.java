package LinkedList;

import java.util.ArrayList;
import java.util.List;

class UndirectGraph {
    private int numVertices;
    private List<List<Integer>> adjacentList;

    public UndirectGraph (int numVertices) {
        this.numVertices = numVertices;
        this.adjacentList = new ArrayList<>(numVertices);

        // loop for the number of vertices
        for (int i = 0; i < numVertices; i++) {
            this.adjacentList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        // undirected Graph
        this.adjacentList.get(source).add(destination);
        this.adjacentList.get(destination).add(source);
    }

    // method for printing the graph
    public void graphPrint() {
        System.out.println("Graph: ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");

            // foreach loop for encapsulation
            for (Integer neighbor : adjacentList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

// main class
public class Undirected_Graph {
    public static void main(String[] args) {
        // object for the UndirectedGraph class
        UndirectGraph grp = new UndirectGraph(5);
        // edges
        grp.addEdge(1, 3);
        grp.addEdge(0, 2);
        grp.addEdge(1, 4);
        grp.addEdge(0, 4);
        grp.addEdge(2, 3);
        // invoking the graph method
        grp.graphPrint();
    }
}

