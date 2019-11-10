package com.myprograms.algorithms.graphs;

import java.util.HashSet;
import java.util.LinkedList;

public class GraphTraversal {

    public boolean hasPathDFS(int source, int destination, Graph graph) {
        Node s = graph.getNode(source);
        Node d = graph.getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s,d,visited);
    }

    private boolean hasPathDFS(Node s, Node d, HashSet<Integer> visited) {
        if(visited.contains(s.id))
            return false;

        System.out.print(s.id+" ");
        visited.add(s.id);
        if(s.id == d.id)
            return true;

        for(Node node : s.adjacent) {
            if(hasPathDFS(node,d,visited))
                return true;
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination, Graph graph) {
        Node s = graph.getNode(source);
        Node d = graph.getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathBFS(s,d,visited);
    }

    private boolean hasPathBFS(Node s, Node d, HashSet<Integer> visited) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        System.out.print(s.id+" ");
        nextToVisit.add(s);
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if(node.id == d.id)
                return true;

            if(visited.contains(s.id))
                return false;

            visited.add(s.id);

            for(Node child : s.adjacent)
                nextToVisit.add(child);

        }
        return false;
    }
}
