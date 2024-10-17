package com.company;

import java.util.*;
import java.util.stream.IntStream;

class GFG {
    static int maxValue(int[] a, int n)
    {
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {

            // Build prefix sum array
            if (i != 0)
                prefix[i] = prefix[i - 1] + a[i];
            else
                prefix[i] = a[i];
            // If the value hasn't been encountered before,
            // It is the first occurrence
            if (!first.containsKey(a[i]))
                first.put(a[i], i);

            // Keep updating the last occurrence
            last.put(a[i], i);
        }

        int ans = -1;

        // Find the maximum sum with same first and last
        // value
        for (int i = 0; i < n; i++) {
            int start = first.get(a[i]);
            int end = last.get(a[i]);
            int sum = 0;
            if(start == 0)
                sum = prefix[end];
            else
                sum = prefix[end] - prefix[start - 1];
            if(sum > ans)
                ans = sum;
        }

        return ans;
    }

    // Driver Code
    public static void main(String args[])
    {
        int[] arr = { 1, 3, 5, 2, 4, 18, 2, 3 };
        int n = arr.length;
        //System.out.print(maxValue(arr, n));

        System.out.println(IntStream.of(arr).sum());

    }
}
