package Assignment6.PartD;

import java.util.Scanner;

public class NearestNumberTotargetBS {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array you want to enter");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array of integers");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        //{1,2,6,9,13,15};
        System.out.println("Enter target number");
        int target = scanner.nextInt();
        int index = findClosest(arr, target);
        System.out.println("Given target "+target+" is closest to number " + arr[index]+ " in given array with index " +index);
    }

    static int findClosest(int[] arr, int target) { //using binary search as array is ascending order
        int start = 0, end = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int minIndex = -1;

        //throws Exception if array is not entered properly
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Enter atleast on number in array");
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            int diff = Math.abs(target - arr[mid]);
            if (diff == 0) {
                return mid;
            } else if (minDiff > diff) {
                minDiff = diff;
                minIndex = mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return minIndex;
    }
}





