package dataStructures;

import java.util.LinkedList;
import java.util.StringJoiner;

public class DirectedGraph {
    private int size;
    private LinkedList<Integer> adjacencyList[];

    public DirectedGraph(int size) {
        this.size = size;
        adjacencyList = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adjacencyList[i] = new LinkedList();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }

    public String bfs(int src) {
        StringJoiner joiner = new StringJoiner("->");
        boolean visited[] = new boolean[this.size];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[src] = true;
        queue.add(src);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            joiner.add(String.valueOf(node));

            for (Integer adjNode : adjacencyList[node]) {
                if (!visited[adjNode]) {
                    visited[adjNode] = true;
                    queue.add(adjNode);
                }
            }
        }

        return joiner.toString();
    }

    public String dfs(int src) {
        StringJoiner joiner = new StringJoiner("->");
        boolean visited[] = new boolean[this.size];
        dfsHelper(src, visited, joiner);
        return joiner.toString();
    }

    private void dfsHelper(int currentNode, boolean visited[], StringJoiner joiner) {
        visited[currentNode] = true;
        joiner.add(String.valueOf(currentNode));

        for (Integer adjNode : adjacencyList[currentNode]) {
            if (!visited[adjNode]) {
                visited[adjNode] = true;
                dfsHelper(adjNode, visited, joiner);
            }
        }
    }
}
