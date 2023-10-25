package pt.utad.mei.aps.Adapter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {3, 7, 1, 14, -4, 23, 2};
        System.out.println("Before: " + Arrays.toString(values));

        SortArray sort = new SelectionSortAdapter();
        sort.Sort(values);
        System.out.println("After: " + Arrays.toString(values));
    }
}