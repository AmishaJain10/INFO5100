

/* Given an array nums, write a function to move all 0’s to the end of it while
maintaining the relative order of the non-zero elements.
For example: [0, 1, 0, 3, 12] return: [1, 3, 12, 0, 0]*/

import java.util.Arrays;

public class MoveZerosTotheEnd {

    public static void main(String args[]) {
        int[] a = {2, 0, 8, 7,0,9,0,8};
        moveZeros(a);
        System.out.println("Zeros moved to the left :");

        System.out.println(Arrays.toString(a));
    }

    static void moveZeros(int[] a) {
        int arraySize = a.length;
        int nonZeroCount = 0; //Count to hold no. of non zero elements in array
        for (int i = 0; i < arraySize; i++) {
            if (a[i] != 0) {
                a[nonZeroCount] = a[i]; //All non zero elements moves forward
                ++nonZeroCount;
            }
        }
        while (nonZeroCount < a.length) {
            a[nonZeroCount] = 0;
            nonZeroCount++;
        }
    }
}
