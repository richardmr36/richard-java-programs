package com.myprograms.algorithms.graphs;

import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {
    public void doTopologicalSort(Graph g) {
        Stack stack = new Stack();
        boolean[] visited = new boolean[g.getSize()+1];
        Arrays.fill(visited,false);

        for(int i=1;i<=g.getSize();i++) {
            if(!visited[i]) {
                doTopologicalSort(g,i,visited,stack);
            }
        }

        while (!stack.empty())
            System.out.print(stack.pop()+" ");
    }

    private void doTopologicalSort(Graph g, int i, boolean[] visited, Stack stack) {
        visited[i] = true;
        for(Node node : g.getNode(i).adjacent) {
            if(!visited[node.id]) {
                doTopologicalSort(g,node.id,visited,stack);
            }
        }

        stack.push(i);
    }
}
