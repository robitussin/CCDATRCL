public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 4;
        int noEdges = 4;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Winnah Jane";
        myGraph.edge[0].dest = "Nica";

        // Edge 2
        myGraph.edge[1].src = "Winnah Jane";
        myGraph.edge[1].dest = "Jonnah";

        // Edge 3
        myGraph.edge[2].src = "Winnah Jane";
        myGraph.edge[2].dest = "Ronn";

        // Edge 4
        myGraph.edge[3].src = "Nica";
        myGraph.edge[3].dest = "Jonnah";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}