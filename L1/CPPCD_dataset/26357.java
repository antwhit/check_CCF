import rpi.goldsd.container.Int;
import rpi.goldsd.graph.*;

public class ShortestPathTest {

    public static void main(String[] args) {
        int numVertices = 12;
        double prob = 0.2;
        Graph G = new Graph("Random Graph", numVertices, prob, 1.0, 10.0);
        G.printSummary();
        Path P = Algorithms.findShortestPath(G.mapToVertex(new Int(1)), G.mapToVertex(new Int(numVertices)));
        System.out.println();
        System.out.println("Shortest Path:");
        System.out.println(P);
        System.out.println("Weight of Path is: " + P.weight());
    }
}
