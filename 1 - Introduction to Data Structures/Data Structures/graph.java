class App {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    App(int vertices, int edges) {
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
        App g = new App(noVertices, noEdges);

        // create graph
        g.edge[0].src = "mark"; // edge mark---jay
        g.edge[0].dest = "jay";

        g.edge[1].src = "mark"; // edge mark---michelle
        g.edge[1].dest = "michelle";

        g.edge[2].src = "michelle"; // edge michelle---jay
        g.edge[2].dest = "jay";

        g.edge[3].src = "jay"; // edge jay---anne
        g.edge[3].dest = "anne";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }

    }
}
