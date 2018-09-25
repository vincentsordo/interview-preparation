package algorithms;

import java.util.*;
import java.lang.StringBuilder;

public class BreadthFirstSearch {

    private int val;
    private LinkedList<Integer> adj[];

    BreadthFirstSearch(int v) {
        this.val = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge (int v, int w) {
        adj[v].add(w);
    }

    String BFS(int s) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean visited[] = new boolean[this.val];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            stringBuilder.append(String.valueOf(s) + " ");

            for (int i : adj[s]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        return stringBuilder.toString();
    }
}
