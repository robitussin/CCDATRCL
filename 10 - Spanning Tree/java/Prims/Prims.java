// Prim's Algorithm in Java

import java.util.Arrays;

class PGraph {

    public void Prim(int G[][], int V) {

        int INF = 9999999;

        int no_edge; // number of edge

        // create a array to track selected vertex
        // selected will become true otherwise false
        boolean[] selected = new boolean[V];

        // set selected false initially
        Arrays.fill(selected, false);

        // set number of edge to 0
        no_edge = 0;

        // the number of egde in minimum spanning tree will be
        // always less than (V -1), where V is number of vertices in
        // graph

        // choose 0th vertex and make it true
        selected[0] = true;

        // print for edge and weight
        System.out.println("Edge : Weight");

        while (no_edge < V - 1) {
            // For every vertex in the set S, find the all adjacent vertices
            // , calculate the distance from the vertex selected at step 1.
            // if the vertex is already in the set S, discard it otherwise
            // choose another vertex nearest to selected vertex at step 1.

            int min = INF;
            int x = 0; // row number
            int y = 0; // col number

            for (int i = 0; i < V; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < V; j++) {
                        // not in selected and there is an edge
                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            selected[y] = true;
            no_edge++;
        }
    }

    public static void main(String[] args) {
        PGraph g = new PGraph();

        // number of vertices in graph
        int V = 7;

        // Ronn Jonnah Tristan Nica Winnah J-Rhyzz Jethro
        // Ronn - 0, 10, 28, 0, 0, 0, 0
        // Jonnah - 10, 0, 0, 25, 0, 0, 0
        // Tristan - 28, 0, 0, 0, 14, 16, 0
        // Nica - 0, 25, 0, 0, 24, 0, 22
        // Winnah - 0, 0, 14, 24, 0, 0, 0
        // J-Rhyzz - 0, 0, 16, 0, 0, 0, 12
        // Jethro - 0, 0, 0, 22, 0, 12, 0

        // create a 2d array of size 5x5
        // for adjacency matrix to represent graph
        int[][] G = { { 0, 10, 28, 0, 0, 0, 0 }, // ronn
                { 10, 0, 0, 25, 0, 0, 0 }, // jonnah
                { 28, 0, 0, 0, 14, 16, 0 }, // tristan
                { 0, 25, 0, 0, 24, 0, 22 }, // nica
                { 0, 0, 14, 24, 0, 0, 0 }, // winnah
                { 0, 0, 16, 0, 0, 0, 12 }, // j-rhyzz
                { 0, 0, 0, 22, 0, 12, 0 } }; // jethro

        g.Prim(G, V);
    }
}