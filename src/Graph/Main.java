package Graph;

public class Main {
    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {
                {1, 2},
                {1, 3},
                {2, 4},
                {2, 5},
                {3, 6},
                {5, 6}
        };
        GraphRepresentation graphRepresentation = new GraphRepresentation();
        graphRepresentation.adjListRepresentation(V, edges);
    }
}
