package com.myprograms.algorithms.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTraversal {

    public static boolean hasPathDFS(int source, int destination, Graph graph) {
        Node s = graph.getNode(source);
        Node d = graph.getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private static boolean hasPathDFS(Node s, Node d, HashSet<Integer> visited) {
        if (visited.contains(s.id))
            return false;

        //System.out.print(s.id+" ");
        visited.add(s.id);
        if (s.id == d.id)
            return true;

        for (Node node : s.adjacent) {
            if (hasPathDFS(node, d, visited))
                return true;
        }
        return false;
    }

    public static boolean hasPathBFS(int source, int destination, Graph graph) {
        Node s = graph.getNode(source);
        Node d = graph.getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathBFS(s, d, visited);
    }

    private static boolean hasPathBFS(Node s, Node d, HashSet<Integer> visited) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        //System.out.print(s.id + " ");
        nextToVisit.add(s);
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (node.id == d.id)
                return true;

            if (visited.contains(node.id))
                return false;

            visited.add(node.id);

            for (Node child : node.adjacent)
                nextToVisit.add(child);

        }
        return false;
    }

    public static String doTopologicalSort(Graph graph) {
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> visitedToCheckForCycle = new HashSet<>();
        Deque<Node> stack = new ArrayDeque<>();
        for (Integer id : graph.nodes.keySet())
            if (!visited.contains(id))
                doTopologicalSort(graph.getNode(id), visited, visitedToCheckForCycle, stack);

        String topSortOrder = String.valueOf(stack.pop().id);
        while (!stack.isEmpty())
            topSortOrder += ("->" + stack.pop().id);

        return topSortOrder;
    }

    private static void doTopologicalSort(Node s, HashSet<Integer> visited, HashSet<Integer> visitedToCheckForCycle, Deque<Node> stack) {
        if(visitedToCheckForCycle.contains(s.id))
            throw new IllegalStateException("Cycle exists in the graph!");

        if (visited.contains(s.id))
            return;

        visitedToCheckForCycle.add(s.id);
        for (Node node : s.adjacent)
            doTopologicalSort(node, visited, visitedToCheckForCycle, stack);

        visited.add(s.id);
        visitedToCheckForCycle.remove(s.id);
        stack.push(s);
    }

    public static String doTopologicalSortUsingKahnAlgorithm(Graph graph) {
        int n = graph.nodes.size();
        int[] inDegree = new int[n];
        Arrays.fill(inDegree, 0);
        for (Integer id : graph.nodes.keySet()) {
            for (Node node : graph.getNode(id).adjacent) {
                inDegree[node.id]++;
            }
        }

        Queue<Node> zeroInDegreeQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0)
                zeroInDegreeQueue.add(graph.getNode(i));
        }

        int countOfVerticesToCheckCycle = 0;
        List<Node> topSortOrderList = new LinkedList<>();
        while (!zeroInDegreeQueue.isEmpty()) {
            Node node = zeroInDegreeQueue.poll();
            topSortOrderList.add(node);
            for (Node adjacent : node.adjacent) {
                if (--inDegree[adjacent.id] == 0)
                    zeroInDegreeQueue.add(adjacent);
            }

            countOfVerticesToCheckCycle++;
        }

        if (countOfVerticesToCheckCycle != n)
            throw new IllegalStateException("Cycle exists in the graph!");

        String topSortOrder = String.valueOf(topSortOrderList.get(0).id);
        for (int i = 1; i < topSortOrderList.size(); i++)
            topSortOrder += ("->" + topSortOrderList.get(i).id);

        return topSortOrder;
    }
}
