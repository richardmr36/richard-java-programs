package com.myprograms.algorithms.selection;

public class SecretaryProblem {
    public int solve(int[] candidates, int n) {
        int optimalWinProbability = (int) Math.round(n / Math.E);
        int bestCandidateIndex = 0;
        for(int i=1;i<optimalWinProbability;i++)
            if(candidates[i] > candidates[bestCandidateIndex])
                bestCandidateIndex = i;

        for(int i=optimalWinProbability;i<candidates.length;i++) {
            if(candidates[i] > candidates[bestCandidateIndex]) {
                bestCandidateIndex = i;
                break;
            }
        }

        if(bestCandidateIndex < 0)
            return 0;
        return bestCandidateIndex;
    }
}
