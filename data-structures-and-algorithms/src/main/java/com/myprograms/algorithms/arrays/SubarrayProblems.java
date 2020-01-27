package com.myprograms.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.myprograms.algorithms.bitmanipulation.BitwiseOperators;

public class SubarrayProblems {
    public static int findMaxSubArraySum(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }

        return maxSoFar;
    }

    public static int[] findMaxSubArray(int[] arr) {
        int currentMax = arr[0];
        int maxSoFar = arr[0];
        int startIndex = 0, endIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            if (currentMax == arr[i])
                startIndex = i;
            maxSoFar = Math.max(currentMax, maxSoFar);
            if (maxSoFar == currentMax)
                endIndex = i;
        }

        return Arrays.copyOfRange(arr, startIndex, endIndex + 1);
    }

    public static int[] findTwoElementsWhoseSumIsTheClosestToZero(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int minLeft = 0;
        int minRight = n - 1;

        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                minLeft = left;
                minRight = right;
            }

            if (sum < 0)
                left++;
            else
                right--;
        }

        int[] result = new int[2];
        result[0] = arr[minLeft];
        result[1] = arr[minRight];
        return result;
    }

    public static boolean isAnyOfContiguousSubarraySumZero(int[] arr) {
        Set<Integer> sumSet = new HashSet<>();
        int sum = 0;
        for (int a : arr) {
            sum += a;
            if (a == 0 || sum == 0 || sumSet.contains(sum))
                return true;
            sumSet.add(sum);
        }

        return false;
    }

    public static long findTotalSumOfAllPossibleSubarrays(int[] arr) {
        long result = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            result += (arr[i] * (i + 1) * (n - i));

        return result;
    }

    public int findLengthOfLongestSubarrayDivisibleByK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int[] modArray = new int[n];

        for (int i = 0, sum = 0; i < n; i++) {
            sum += arr[i];
            modArray[i] = ((sum % k) + k) % k; //Taking modulo twice due to possible negative sum
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (modArray[i] == 0)
                max = i + 1;

            else if (!map.containsKey(modArray[i]))
                map.put(modArray[i], i);

            else
                max = Math.max(max, i - map.get(modArray[i]));
        }

        return max;
    }

    public int countNoOfSubarraysDivisibleByK(int[] arr, int k) {
        int n = arr.length;
        int[] modArray = new int[k];
        Arrays.fill(modArray, 0);

        for (int i = 0, sum = 0; i < n; i++) {
            sum += arr[i];
            modArray[((sum % k) + k) % k]++;
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            if (modArray[i] > 1)
                result += (modArray[i] * (modArray[i] - 1)) / 2;
        }

        return result + modArray[0];
    }

    public static int findCountOfSubarraysWithAtmostKOddNumbers(int[] arr, int k) {
        /*int count = 0;
        int n = arr.length;
        int[] prefix = new int[n];
        int odd = 0;

        for (int i = 0; i < n; i++) {
            prefix[odd]++;

            if (BitwiseOperators.isOdd(arr[i]))
                odd++;

            if (odd >= k)
                count += prefix[odd - k];
        }

        return count;*/

        /*if (arr != null && arr.length > 0) {
            int oddCount = 0, i = 0, last = -1;
            Set<String> subArray = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            while (i < arr.length) {
                int num = arr[i];
                if (num % 2 == 1) {
                    oddCount++;
                }
                subArray.add(String.valueOf(num));
                while (oddCount > k && last < i) {
                    int pop = arr[++last];
                    if (pop % 2 == 1) {
                        oddCount--;
                    }
                    if (last +1 != i) {
                        sb.replace(0, sb.indexOf(",") + 1, "");
                        subArray.add(sb.toString());
                    } else {
                        sb = new StringBuilder();
                    }
                }

                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(num);
                subArray.add(sb.toString());
                i++;
            }
            while (last < arr.length) {
                last++;
                sb.replace(0, sb.indexOf(",") + 1, "");
                subArray.add(sb.toString());
            }
            return subArray.size();
        }
        return 0;*/

        int count = 0;
        int n = arr.length;
        // traverse for all possible
        // subarrays
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++)
        {
            int odd = 0;
            String str = "";
            for (int j = i; j < n; j++)
            {
                if (arr[j] % 2 ==1)
                    odd++;

                // if count of odd numbers
                // in subarray is m
                if (odd <= k) {
                    str += arr[j];
                    str+=",";
                    if(!set.contains(str)) {
                        count++;
                        set.add(str);
                    }
                }
            }
        }

        return count;
    }
}
