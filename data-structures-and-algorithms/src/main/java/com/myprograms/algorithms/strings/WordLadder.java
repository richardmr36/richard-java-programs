package com.myprograms.algorithms.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    private static class WordNode {
        String word;
        int chainLength;

        public WordNode(String word, int chainLength) {
            this.word = word;
            this.chainLength = chainLength;
        }
    }


    private static HashMap<String, ArrayList<String>> smallerWordsMap = new HashMap<>();
    private static HashMap<String, ArrayList<String>> wordToPathMap = new HashMap<>();
    private static HashSet<String> visitedWords = new HashSet<>();

    public static int findMinLengthOfChainToConvertSourceToTargetUsingBFS(String source, String target, String[] dictionary) {
        Queue<WordNode> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new WordNode(source, 1));
        while (!queue.isEmpty()) {
            WordNode currentWordNode = queue.remove();
            for (int i = 0; i < dictionary.length; i++) {
                String word = dictionary[i];
                if (isAdjacent(currentWordNode.word, word) && !visited.contains(word)) {
                    WordNode wordNode = new WordNode(word, currentWordNode.chainLength + 1);
                    if (wordNode.word.equals(target))
                        return wordNode.chainLength;

                    visited.add(word);
                    queue.add(wordNode);
                }
            }
        }

        return 0;
    }

    public static int findMinLengthOfChainToConvertSourceToTargetUsingBidirectionalBFS(String source, String target, String[] dictionary) {
        Queue<WordNode> queue1 = new LinkedList<>();
        Queue<WordNode> queue2 = new LinkedList<>();

        Map<String, Integer> visited1 = new HashMap<>();
        Map<String, Integer> visited2 = new HashMap<>();

        queue1.add(new WordNode(source, 1));
        visited1.put(source, 1);

        queue2.add(new WordNode(target, 1));
        visited2.put(target, 1);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            WordNode currentWordNode1 = queue1.remove();
            WordNode currentWordNode2 = queue2.remove();
            for (int i = 0; i < dictionary.length; i++) {
                String word = dictionary[i];
                if (isAdjacent(currentWordNode1.word, word) && !visited1.containsKey(word)) {
                    WordNode wordNode = new WordNode(word, currentWordNode1.chainLength + 1);
                    if (wordNode.word.equals(target))
                        return wordNode.chainLength;

                    if (visited2.containsKey(wordNode.word))
                        return wordNode.chainLength + visited2.get(wordNode.word) + 1;

                    visited1.put(word, currentWordNode1.chainLength + 1);
                    queue1.add(wordNode);
                }
            }

            for (int i = 0; i < dictionary.length; i++) {
                String word = dictionary[i];
                if (isAdjacent(currentWordNode2.word, word) && !visited2.containsKey(word)) {
                    WordNode wordNode = new WordNode(word, currentWordNode2.chainLength + 1);
                    if (wordNode.word.equals(source))
                        return wordNode.chainLength;

                    if (visited1.containsKey(wordNode.word))
                        return wordNode.chainLength + visited1.get(wordNode.word) - 1;

                    visited2.put(word, currentWordNode2.chainLength + 1);
                    queue2.add(wordNode);
                }
            }
        }

        return 0;
    }

    private static boolean isAdjacent(String source, String target) {
        int differenceInLetters = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) != target.charAt(i))
                differenceInLetters++;

            if (differenceInLetters > 1)
                return false;
        }

        return true;
    }

    private static HashMap<String, ArrayList<String>> createSmallerWordMap(String[] dictionary) {
        for (String word : dictionary) {
            for (int i = 0; i < word.length(); i++) {
                // form a smaller word by omitting a character index of omitted character is appended to the end of this smaller word.
                // Example: 'log' and 'leg' would both form a key 'lg1' when char at index 1 is omitted
                String smallerWord = word.substring(0, i) + word.substring(i + 1) + i;

                ArrayList<String> list = smallerWordsMap.get(smallerWord);
                if (list == null) {
                    list = new ArrayList<>();
                    smallerWordsMap.put(smallerWord, list);
                }
                list.add(word);
            }
        }

        return smallerWordsMap;
    }

    private static ArrayList<String> convertWord(String source, String target, HashMap<String, ArrayList<String>> smallerWordsMap) {
        ArrayList<String> existingPath = wordToPathMap.get(source);
        if (existingPath != null && existingPath.size() > 0)
            return existingPath;

        if (visitedWords.contains(source))
            return null;
        visitedWords.add(source);

        ArrayList<String> minPath = new ArrayList<>();

        for (int i = 0; i < source.length(); i++) {
            String smallerWord = source.substring(0, i) + source.substring(i + 1) + i;

            ArrayList<String> list = smallerWordsMap.get(smallerWord);
            for (String word : list) {
                if (word.equals(source))
                    continue;

                if (word.equals(target)) {
                    ArrayList<String> currPath = new ArrayList<>();
                    currPath.add(word);
                    wordToPathMap.put(word, currPath);
                    return currPath;
                }

                ArrayList<String> fwdPath = convertWord(word, target, smallerWordsMap);

                if (fwdPath != null && fwdPath.size() > 0) {
                    if (minPath.size() == 0 || minPath.size() > 1 + fwdPath.size()) {
                        minPath.clear();
                        minPath.add(word);
                        minPath.addAll(fwdPath);
                    }
                }
            }
        }

        wordToPathMap.put(source, minPath);
        return minPath;
    }

    public static String getMinPathToConvertSourceToTarget(String source, String target, String[] dictionary) {
        HashMap<String, ArrayList<String>> smallerWordsMap = createSmallerWordMap(dictionary);
        return buildPath(source, convertWord(source, target, smallerWordsMap));
    }

    private static String buildPath(String source, ArrayList<String> path) {
        String result = source;
        for (String str : path)
            result += "->" + str;

        return result;
    }
}
