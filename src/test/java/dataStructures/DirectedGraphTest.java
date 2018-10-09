package dataStructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectedGraphTest {

    DirectedGraph directedGraph;

    @Before
    public void setUp(){
        directedGraph = new DirectedGraph(4);
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(0, 2);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 0);
        directedGraph.addEdge(2, 3);
        directedGraph.addEdge(3, 3);
    }

    @Test
    public void bfs() {
        assertEquals("2->0->3->1", directedGraph.bfs(2));
    }

    @Test
    public void dfs() {
        assertEquals("2->0->1->3", directedGraph.dfs(2));
    }
}