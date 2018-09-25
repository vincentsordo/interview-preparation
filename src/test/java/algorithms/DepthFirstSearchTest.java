package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepthFirstSearchTest {
    private DepthFirstSearch dfs;

    @Before
    public void init() {
        dfs = new DepthFirstSearch(4);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);
    }

    @Test
    public void testDFS() {
        assertEquals(dfs.DFS(2), "2 0 1 3 ");
    }

}