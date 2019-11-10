package com.myprograms.algorithms.graphs;

import java.util.HashSet;

public class GraphCycleChecker {

    public boolean checkForCycleInUndirectedGraph(Graph g, int start) {
        HashSet<Integer> visited = new HashSet<>();
        for(Integer id : g.getNodes().keySet()) {
            if(!visited.contains(id)) {
                if(hasPathDFSForUndirectedGraph(g.getNode(id), visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathDFSForUndirectedGraph(Node s, HashSet<Integer> visited, int parent) {

        visited.add(s.id);

        for (Node node : s.adjacent) {
            if (!visited.contains(node.id)) {
                if (hasPathDFSForUndirectedGraph(node, visited, s.id))
                    return true;
            }

            else if(node.id != parent)
                return true;
        }

        return false;
    }
}
