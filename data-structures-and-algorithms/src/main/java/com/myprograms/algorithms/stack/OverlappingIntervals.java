package com.myprograms.algorithms.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
        Arrays.sort(intervals, Comparator.comparingInt(o -> o.start));
        List<Interval> mergedList = new ArrayList<>();
        Interval interval = intervals[0];

        for(int i=1;i<intervals.length;i++) {
            Interval current = intervals[i];
            if(current.start <= interval.end) {
                interval.end = Math.max(interval.end, current.end);
            }
            else {
                mergedList.add(interval);
                interval = current;
            }
        }

        mergedList.add(interval);

        Interval[] result = mergedList.toArray(new Interval[mergedList.size()]);
        Arrays.sort(result, Comparator.comparingInt(o -> o.start));
        return result;
    }
}
