package com.myprograms.algorithms.stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class OverlappingIntervals {
    private static Stack<Interval> stack = new Stack<>();

    public static Interval[] mergeOverlappingIntervalsUsingStack(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o.start));
        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            Interval top = stack.peek();

            if (top.end < intervals[i].start)
                stack.push(intervals[i]);

            else if (top.end < intervals[i].end) {
                top = stack.pop();
                top.end = intervals[i].end;
                stack.push(top);
            }
        }

        Interval[] result = new Interval[stack.size()];
        int index = 0;
        while (!stack.isEmpty())
            result[index++] = stack.pop();

        Arrays.sort(result, Comparator.comparingInt(o -> o.start));
        return result;
    }

    public static Interval[] mergeOverlappingIntervals(Interval[] intervals) {
        Comparator<Interval> intervalComparator = Comparator.comparingInt(o -> o.start);
        Arrays.sort(intervals, intervalComparator.reversed());
        int index = 0;
        for (int i = 0; i < intervals.length; i++, index++) {
            if (index != 0 && intervals[index - 1].start <= intervals[index].end) {
                while (index != 0 && intervals[index - 1].start <= intervals[index].end) {
                    intervals[index - 1].end = Math.max(intervals[index - 1].end, intervals[i].end);
                    intervals[index - 1].start = Math.min(intervals[index - 1].start, intervals[i].start);
                    index--;
                }
            }
            else{
                intervals[index] = intervals[i];
            }
        }


        Interval[] result = Arrays.copyOf(intervals, index);
        Arrays.sort(result, Comparator.comparingInt(o -> o.start));
        return result;
    }
}
