import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @program: homework_assignment_5
 * @filename: ListManipulator.java
 * @author: Ke Chen
 * @date: 2020/10/10
 **/
public class ListManipulator {
    /**
     * Accepts an array list of integers and sorts it in ascending
     * or descending order. Make sure to account for cases with
     * duplicate values. The method returns the sorted list.
     *
     * @param myLst
     * @param ascending
     * @return
     */
    ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        int i, j, n = myLst.size();
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (ascending) {
                    if (myLst.get(j - 1) > myLst.get(j)) {
                        int temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                } else {
                    if (myLst.get(j - 1) < myLst.get(j)) {
                        int temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                }
            }
        }
        return myLst;
    }

    /**
     * Accepts an array list of integers, creates a table of unique
     * values and the number of times each value occurs, sorts this table,
     * and outputs it to command line.
     *
     * @param myLst
     */
    void table(ArrayList<Integer> myLst) {
        ArrayList word2Count = new ArrayList<int[]>();
        for (int t : myLst) {
            boolean inWord2Count = false;
            for (int i = 0; i < word2Count.size(); i++) {
                int[] item = (int[]) word2Count.get(i);
                if (t == item[0]) {
                    item[1] += 1;
                    word2Count.set(i, item);
                }
            }
            if (!inWord2Count) {
                word2Count.add(new int[]{t, 1});
            }
        }
        int i, j, n = word2Count.size();
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                int[] a = (int[]) word2Count.get(j - 1);
                int[] b = (int[]) word2Count.get(j);
                if (a[1] < b[1]) {
                    int[] temp = a;
                    word2Count.set(j - 1, b);
                    word2Count.set(j, a);
                }
            }
        }
        for (i = 0; i < word2Count.size(); i++) {
            int[] item = (int[]) word2Count.get(i);
            System.out.printf("%d : %d\n", item[0], item[1]);
        }
    }


    /**
     * Accept an array list of integers and swamps positions of the largest
     * and the smallest elements. If multiple values representing largest/
     * smallest elements are present then pick the first position. The method
     * returns the modified list.
     *
     * @param myLst ArrayList<Integer> an array list of integers
     * @return result  ArrayList<Integer>  the modified list
     */
    ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        if (myLst.size() == 0) {
            return myLst;
        }
        int largestIndex = 0, smallestIndex = 0;
        int largest = myLst.get(0), smallest = myLst.get(0);
        for (int i = 0; i < myLst.size(); i++) {
            if (myLst.get(i) > largest) {
                largest = myLst.get(i);
                largestIndex = i;
            }
            if (myLst.get(i) < smallest) {
                smallest = myLst.get(i);
                smallestIndex = i;
            }
        }
        int temp = myLst.get(largestIndex);
        myLst.set(largestIndex, smallest);
        myLst.set(smallestIndex, temp);
        return myLst;
    }

    public static void main(String[] args) {
        int[] ints = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        ArrayList<Integer> intList = new ArrayList<Integer>(ints.length);
        for (int i : ints) {
            intList.add(i);
        }
        ListManipulator listManipulator = new ListManipulator();
        listManipulator.sort(intList, false);

        System.out.println("sort ascending:");
        for (int i : intList) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("swapLargestSmallest:");
        listManipulator.swapLargestSmallest(intList);
        for (int i : intList) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("table:");
        listManipulator.table(intList);
    }
}
