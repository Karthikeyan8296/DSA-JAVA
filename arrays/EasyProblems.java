package arrays;

import java.util.Arrays;

public class EasyProblems {

    public void Second_Largest_Problem() {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int arr[] = { 5, 9, 7, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] != firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("second largest number is = " + secondMax);
    }

    public void Third_Largest_Problem() {
        int arr[] = { 1, 14, 2, 16, 10, 20 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] != firstMax && arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] != secondMax && arr[i] != firstMax && arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println("third largest number is = " + thirdMax);
    }

    // Maximum product of a triplet (subsequence of size 3) in array
    // ThreeGreatCondidates
    public void MaxProductOfTriplet() {
        int arr[] = { 1000, 1000, 1000 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println("Three Great Candidates is = " + firstMax * secondMax * thirdMax);
    }

    // Maximum product of three numbers
    public void MaximumProduct() {
        int nums[] = { 1000, 1000, 1000 };
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        Arrays.sort(nums);
        int len = nums.length;

        int prod1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int prod2 = nums[0] * nums[1] * nums[len - 1];

        System.out.println("Maximum product of three numbers = " + Math.max(prod1, prod2));
    }

    // Maximum consecutive one's - 1
    public void MaxConsecutives() {
        int nums[] = { 1, 0, 0, 1, 1, 1, 0 };
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        System.out.println("Maximum consecutive one's = " + Math.max(count, maxCount));
    }

    // Moving all Zero's to end
    public void MoveAllZero() {
        int arr[] = { 3, 0, 12, 0, 0, 5, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int index = 0; // index value is used to align the non zero and zero values

        // taking all the non-zeros and moving it to the first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // after the non-zero values, filling the array with 0's
        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.print("Move all Zeros To End = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Reverse Array in Group
    public void ReverseGroup() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // interating the loop with the Kth values
        for (int i = 0; i < arr.length; i = i + k) {

            // finding the start and end of the sub arrays
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);

            // normal reverse method
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        System.out.print("Reverse Group using Kth values = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // left Rotation
    public void leftRotation() {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Array becomes [2, 3, 4, 5, 5]
        }
        arr[arr.length - 1] = first;

        System.out.print("Left Rotation by 1 = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // right Rotation
    public void rightRotation() {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1]; // Array becomes [1, 1, 2, 3, 4]
        }
        arr[0] = last;

        System.out.print("Rigth Rotation by 1 = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Left Rotation by Kth values
    public void leftRotationKthValue() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int index = 0; index < k; index++) {
            int first = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = first;
        }

        System.out.print("Left Rotation by Kth Value = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Right Rotation by Kth Values
    public void rightRoatationKthValue() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int index = 0; index < k; index++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        System.out.print("Right Rotation by Kth Value = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Wave Array problem
    public void waveArray() {
        int arr[] = { 10, 5, 6, 3, 2, 20, 100, 80 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Wave Array swap
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1);
        }

        System.out.print("Wave Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Plus one problem
    public int[] plusOne() {
        int arr[] = { 9, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr; // done
            } else {
                arr[i] = 0; // if 9 make it as 0
            }
        }

        int[] newDigit = new int[arr.length + 1];
        newDigit[0] = 1; // add 1 at the start
        return newDigit;
    }
}
