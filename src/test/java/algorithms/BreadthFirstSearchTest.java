package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstSearchTest {

    private BreadthFirstSearch bfs;

    @Before
    public void init() {
        bfs = new BreadthFirstSearch(4);

        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,0);
        bfs.addEdge(2,3);
        bfs.addEdge(3,3);
    }

    @Test
    public void testBFS() {
        assertEquals(bfs.BFS(2), "2 0 3 1 ");
    }
}