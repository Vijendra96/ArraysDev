package com.array.pdf;

public class Y30 {


	public static int[] uniqueElements(int[] arr, int start, int end) {
    Set<Integer> set = new HashSet<>();
    for (int i = start; i <= end; i++) {
        set.add(arr[i]);
    }
    int[] result = new int[set.size()];
    int i = 0;
    for (int num : set) {
        result[i++] = num;
    }
    return result;
}
}
