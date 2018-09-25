package algorithms;

import java.util.LinkedList;

public class DepthFirstSearch {
    private int val;
    private LinkedList<Integer> adj[];

    DepthFirstSearch(int v) {
        this.val = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public String DFS(int v) {
        boolean visited[] = new boolean[this.val];
        StringBuilder stringBuilder = new StringBuilder();
        dfsRecursion(v, visited, stringBuilder);

        return stringBuilder.toString();
    }

    private void dfsRecursion(int v, boolean[] visited, StringBuilder stringBuilder) {
        visited[v] = true;

        stringBuilder.append(v + " ");

        for (int i : adj[v]) {
            if (!visited[i]) {
                dfsRecursion(i, visited, stringBuilder);
            }
        }
    }


}
