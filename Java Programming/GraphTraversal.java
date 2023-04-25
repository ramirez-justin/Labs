// Justin Ramirez
// CSC 2720 Lab
// Class Time: TH 1415
// Due time: 4/11/2023 @ 2359
import java.util.*;
/*
 * Test Cases:
 * Graph g = new Graph(4);
 * Expected output: 0 1 2 3
 * 
 * Graph g = new Graph(3);
 * g.addEdge(0, 1);
 * Expected output: 0 1
 * 
 * Graph g = new Graph(4);
 * g.addEdge(0, 1);
 * g.addEdge(1, 2);
 * g.addEdge(2, 0);
 * g.addEdge(2, 3);
 * Expected output: 0 1 2 3
 */

public class GraphTraversal {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.addEdge(1, 3);
        g.addEdge(3, 5);

        boolean[] visited = new boolean[g.V];
        dfs(0, g, visited);
    }


    static class Graph {
        int V; //Number of Vertices
        LinkedList<Integer>[] adj; // adjacency lists
    
        Graph(int V) {
            this.V = V;
            adj = new LinkedList[V];
            for (int i = 0; i < adj.length; i++) {
                adj[i] = new LinkedList<Integer>();
            }
        }
    
        void addEdge(int v, int w) {
            adj[v].add(w);
        }
    }

    // Recursive DFS
    static void dfs(int v, Graph g, boolean[] visited) {
        visited[v] = true; // mark current vertex as visited
        System.out.print(v + " ");
        for (int i : g.adj[v]) { // go to all adjacent vertices
            if (!visited[i]) {
                dfs(i, g, visited);
            }
        }
    }
    
}
