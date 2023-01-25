package _17_01_2023;

import lombok.AllArgsConstructor;

import java.util.*;

//класс для хранения ребер
@AllArgsConstructor
public class Edge {
    int source;
    int dest;
    int weight;
}

@AllArgsConstructor
class Node {
    int vertex; //вершина
    int weight;
}

//Класс для граф объекта
class Graph {
    //Список списков для смежности
    List<List<Edge>> adjList;

    //Constructor
    Graph(List<Edge> edges, int n) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        //Add edge
        for (Edge edge : edges) {
            adjList.get(edge.source).add(edge);
        }
    }
}

class Main {
    private static void getRoute(int[] prev, int i, List<Integer> route) {
        if (i >= 0) {
            getRoute(prev, prev[i], route);
            route.add(i);
        }
    }

    //Find the shortest path
    public static void findTheShortestPath(Graph graph, int source, int nodeNumbers) {
        //Create node's queue
        PriorityQueue<Node> minHeap;
        minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        minHeap.add(new Node(source, 0));

        //Set up distance like infinite
        List<Integer> dist;
        dist = new ArrayList<>(Collections.nCopies(nodeNumbers, Integer.MAX_VALUE));

        //source to source
        dist.set(source, 0);

        //logical array to save min dist
        boolean[] done = new boolean[nodeNumbers];
        done[source] = true;

        //save prev node
        int[] prev = new int[nodeNumbers];
        prev[source] = -1;

        while (!minHeap.isEmpty()) {
            //delete and retrieve the best node
            Node node = minHeap.poll();

            //get node number
            int vertex = node.vertex;

            for (Edge edge : graph.adjList.get(vertex)) {
                int v = edge.dest;
                int weight = edge.weight;

                //Relaxation
                if(!done[v] && (dist.get(vertex) + weight) < dist.get(v)) {
                    dist.set(v, dist.get(vertex) + weight);
                    prev[v] = vertex;
                    minHeap.add(new Node(v, dist.get(v)));
                }
            }
            //set up the vertex like "done"
            done[vertex] = true;
        }

        List<Integer> route = new ArrayList<>();

        for (int i = 0; i < nodeNumbers; i++) {
            if(i != source && dist.get(i) != Integer.MAX_VALUE) {
                getRoute(prev, i, route);
                System.out.printf("Path (%d -> %d): Minimum cost = %d, Route = %s \n",
                        source, i, dist.get(i), route);
                route.clear();
            }
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 10),
                new Edge(0, 4, 3),
                new Edge(1, 2, 2),
                new Edge(1, 4, 4),
                new Edge(2, 3, 9),
                new Edge(3, 2, 7),
                new Edge(4, 1, 1),
                new Edge(4, 2, 8),
                new Edge(4, 3, 2));

        int n = 5;
        Graph graph = new Graph(edges, n);
        for (int source = 0; source < n; source++) {
            findTheShortestPath(graph, source, n);
        }
    }
}